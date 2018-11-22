cd /d %~dp0
echo  now dir is %cd%
cd %cd%
echo create temp dir
md c:\temp
echo installing print service as windows service.....
call bin/print install
echo start print service!
call bin/print start