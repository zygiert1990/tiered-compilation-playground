## Quick start
1. To see bytecode: `javap -c -p target.classes.org.zygiert.Main`
2. To see compilation detailed info and create log: `java -XX:+UnlockDiagnosticVMOptions -XX:+PrintCompilation -XX:+LogCompilation -XX:LogFile=compilation_log -jar target/TieredCompilationPlayground-1.0-SNAPSHOT.jar 350`
3. Flag to limit tiered compilation level: `-XX:TieredStopAtLevel=1`
4. Flag to disable JIT compiler: `-Xint`
5. Flag to disable interpreter: `-Xcomp`
6. Flag to see details about JVM startup: `-Xlog:startuptime`