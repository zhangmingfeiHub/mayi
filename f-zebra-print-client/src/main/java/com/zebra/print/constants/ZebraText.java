/**
 *
 * @author mingfei.z 2018年11月7日 下午5:28:00
 */
package com.zebra.print.constants;

/**
 * 标签文本内容
 * @author mingfei.z
 */
public class ZebraText extends ZebraElement {

	private int textX = 20; // x轴位置
	private int textY = 20; // y轴位置
	private String text; // 打印内容
	private StringBuilder zplCommand = new StringBuilder(); // ZPL命令
	private final String newLineChar = "\n"; // 换行符
	private int cnCharDist = 23; // 中文字符间距
	private int charDist = 12; // 英文字符间距
	private int cnCharSize = 20; // 中文字符宽高度
	private int charSize = 20; // 英文字符宽高度
	private boolean lineFlag = false; // 是否可换行
	private int lineDist = 30; // 行距
	private int lineLoc = 252; // 一行的宽度，超过则换行

	/**
	 * 文本内容
	 * @param text x/y轴起始位置默认20
	 */
	public ZebraText(String text) {
		this.text = text;
	}
	
	/**
	 * 填充文本内容
	 * @param text 打印内容
	 * @param textX x轴位置，默认20
	 * @param textY y轴位置，默认20
	 */
	public ZebraText(String text, int textX, int textY) {
		this.text = text;
		this.textX = textX;
		this.textY = textY;
	}

	/**
	 * 填充文本内容
	 * @param text 打印内容
	 * @param textX x轴位置，默认20
	 * @param textY y轴位置，默认20
	 * @param lineFlag 是否换行
	 */
	public ZebraText(String text, int textX, int textY, boolean lineFlag) {
		this(text, textX, textY);
		this.lineFlag = lineFlag;
	}
	
	/**
	 * 获取打印该文本的ZPL命令
	 * 
	 * @return
	 * @author mingfei.z
	 */
	public String getZplCommand() {
		this.setText(this.text, this.textX, this.textY);
		return zplCommand.toString();
	}
	
	@Override
	String getZplCommand(int labelX) {
		this.lineLoc += labelX;
		this.setText(this.text, this.textX + labelX, this.textY);
		return zplCommand.toString();
	}
	
	private void setText(String text, int textX, int textY) {
		int x = textX;
        int y = textY;
        if (text != null) {
            char[] charArray = text.toCharArray();
            int lineCount = 1; // 行数
            for (int off = 0; off < charArray.length;) {
                char c = charArray[off];
                if (!checkChar(c)) { // 如果是中文字符
                    setChar(String.valueOf(c), x, y, true);
                    x = x + cnCharDist;
                } else {
                    setChar(String.valueOf(c), x, y+3, false);
                    x = x + charDist;
                }

                off++;
                
                if (lineFlag && x > lineLoc) {
                	if (lineCount == 2) // 只打两行
                		return;
                	
                	x = textX;
                	y = textY + lineDist * lineCount;
                	lineCount++;
                }
            }
            
            lineCount = 1;
        }

	}
	
	/**
	 * 判断是否英文字符
	 * 
	 * @param ch
	 * @return
	 * @author mingfei.z
	 */
	private boolean checkChar(char ch) {
        if ((ch + "").getBytes().length == 1) {
            return true;//英文
        } else {
            return false;//中文
        }
    } 
	
	/**
	 * 拼接ZPL命令
	 * @param str 字符
	 * @param x x位置
	 * @param y y位置
	 * @param cn true-表示中文字符
	 * @author mingfei.z
	 */
	private void setChar(String str, int x, int y, boolean cn) {
        if (cn) {
        	zplCommand.append("^CI14")
        		.append("^FO" + x + "," + y)
        		.append("^A1N," + cnCharSize + "," + cnCharSize)
        		.append("^FD" + str + "^FS").append(newLineChar);
        } else {
        	zplCommand.append("^CI0")
	    		.append("^FO" + x + "," + y)
	    		.append("^A0N," + charSize + "," + charSize)
	    		.append("^FD" + str + "^FS").append(newLineChar);
        }
    }
	
}
