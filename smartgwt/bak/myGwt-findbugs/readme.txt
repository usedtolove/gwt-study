a simple SmartGwt project with FindBugs Maven Plugin.

(from : http://mojo.codehaus.org/findbugs-maven-plugin/#examplesfindbugs.html)

FindBugs looks for bugs in Java programs. It is based on the concept of bug patterns. A bug pattern is a code idiom that is often an error. Bug patterns arise for a variety of reasons:

    * Difficult language features
    * Misunderstood API methods
    * Misunderstood invariants when code is modified during maintenance
    * Garden variety mistakes: typos, use of the wrong boolean operator

FindBugs uses static analysis to inspect Java bytecode for occurrences of bug patterns. We have found that FindBugs finds real errors in most Java software. Because its analysis is sometimes imprecise, FindBugs can report false warnings, which are warnings that do not indicate real errors. In practice, the rate of false warnings reported by FindBugs is generally less than 50%.

FindBugs is free software, available under the terms of the Lesser GNU Public License. It is written in Java, and can be run with any virtual machine compatible with Java 5. It can analyze programs written for any version of Java. FindBugs was originally developed by Bill Pugh. It is maintained by Bill Pugh, David Hovemeyer, and a team of volunteers.

FindBugs uses BCEL to analyze Java bytecode. It uses dom4j for XML manipulation.

This introduction is an excerpt from the Facts Sheet at FindBugs home page.

See a sample report.

To see more documentation about FindBugs' options, please see the FindBugs Manual.

