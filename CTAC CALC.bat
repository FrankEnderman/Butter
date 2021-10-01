:: Interstar Corp.
:: this is a separate product included in butter OS.
@echo off
title CALCULATOR
goto calc
:calc
cls
ECHO Calculator Version 1.4
echo.
ECHO * = MULTIPLY
ECHO + = ADD
ECHO - = SUBTRACT
ECHO / = DIVIDE
echo % = boolean/remainder
SET /p UDefine= 
SET /a UDefine=%UDefine%
ECHO =
ECHO %UDefine%
ECHO.
pause
goto calc