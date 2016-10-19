@echo off
:f
java -Xmx2G -XX:+UseConcMarkSweepGC -XX:+CMSIncrementalMode -XX:-UseAdaptiveSizePolicy -Xmn128M -jar spigot-1.8.8.jar
pause
goto f