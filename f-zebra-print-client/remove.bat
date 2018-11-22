cd /d %~dp0
echo  now dir is %cd%
cd %cd%
echo stop print service!
call bin/print stop
echo reomve print service from windows service.....
call bin/print remove
