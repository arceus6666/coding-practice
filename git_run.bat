@ECHO OFF
ECHO Running!

set s = "-s ->" git status
set a = "-a ->" git add * & git commit -m ^"code^" & git push
set o = "-o ->" git add file & git commit -m ^"code^" & git push

IF "%~1"=="" GOTO info

IF "%~1"=="-s" GOTO status

IF "%~1"=="-a" GOTO all

IF "%~1"=="-o" GOTO one

:info
ECHO %s%
ECHO %a%
ECHO %o%
GOTO end

ECHO add, push and commit %1
git add %1
git commit -m "code"
git push
GOTO end

:all
ECHO add, push and commit *
git add *
git commit -m "code"
git push
GOTO end

REM git add *
REM git commit -m "code"
REM git push

:end
PAUSE
