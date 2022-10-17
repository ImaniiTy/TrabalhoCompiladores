@echo off

rmdir "src/%1/analysis" /S /Q
rmdir "src/%1/lexer" /S /Q
rmdir "src/%1/node" /S /Q
rmdir "src/%1/parser" /S /Q

echo All files deleted

java -jar C:\sablecc\lib\sablecc.jar "src/%1.sable"