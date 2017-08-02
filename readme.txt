
Submission Requirements: 

3a) Team: Thor Olesen (ID: 16929547) and Dennis Thinh Tan Nguyen (ID: 16929628)

3b) Files: Main.java, Buffer.java, Producer.java, Consumer.java, Constants.java, IBuffer.java, IQueue.java, BufferItem.java, CircularQueue.java, Sleep.java, CircularQueueTest.java 

Note that interfaces are located in the “interface” directory, test in “tests” directory and utility classes in “utility” directory. 

3c) Instructions to compile and run program:
	1) Go to root directory of “assignment” in terminal
	2) Compile program by entering: javac *.java
	3) Run program “Main” with 3 arguments (producers, consumers and sleep time)
		3a) Example: java Main 5 5 10 

3d) Task 4 Test Run - Results and Answers: 

1) Test run 1 results (1 producer, 1 consumer, 5 buffer size, 10 second main sleep)

Main thread  : Sleep for 10 seconds
Producer 11 : Sleep for 2 seconds
Consumer Thread: 12 : Sleep for 4 seconds
Process ID: 11 Produced item: 1284785019
Producer 11 : Sleep for 1 seconds
Process ID: 11 Produced item: 2121939556
Producer 11 : Sleep for 4 seconds
Consumer Thread: 12 is consuming
Process ID: 12 consumed item: 1284785019
Consumer Thread: 12 : Sleep for 2 seconds
Consumer Thread: 12 is consuming
Process ID: 12 consumed item: 2121939556
Consumer Thread: 12 : Sleep for 2 seconds
Process ID: 11 Produced item: -667245816
Producer 11 : Sleep for 0 seconds
Process ID: 11 Produced item: -871525936
Producer 11 : Sleep for 4 seconds
Consumer Thread: 12 is consuming
Process ID: 12 consumed item: -667245816
Consumer Thread: 12 : Sleep for 1 seconds
Consumer Thread: 12 is consuming
Process ID: 12 consumed item: -871525936
Consumer Thread: 12 : Sleep for 2 seconds

Result Explanation:

In the first result set, there is a one-to-one correspondence between producers and consumers.
Thus, there is no wait time since the producer and consumer continuously swap inserting and removing items respectively.
The buffer size is big enough to ensure that both the Producer and Consumer does not have to wait.


2) Test Run 2 results (5 producers, 5 consumers, 1 buffer size, 10 second main sleep)

Consumer Thread: 18 : Sleep for 3 seconds
Consumer Thread: 16 : Sleep for 4 seconds
Consumer Thread: 19 : Sleep for 0 seconds
Producer 11 : Sleep for 3 seconds
Consumer Thread: 17 : Sleep for 2 seconds
Main thread  : Sleep for 10 seconds
Producer 14 : Sleep for 4 seconds
Consumer Thread: 19 is consuming
Producer 15 : Sleep for 1 seconds
Buffer unavailable -- Consumer Thread: 19 is waiting...
Producer 12 : Sleep for 3 seconds
Consumer Thread: 20 : Sleep for 4 seconds
Producer 13 : Sleep for 3 seconds
Process ID: 15 Produced item: 1992568644
Producer 15 : Sleep for 4 seconds
Process ID: 19 consumed item: 1992568644
Consumer Thread: 19 : Sleep for 3 seconds
Consumer Thread: 17 is consuming
Buffer unavailable -- Consumer Thread: 17 is waiting...
Consumer Thread: 18 is consuming
Buffer unavailable -- Producer Thread: 12 is waiting.
Process ID: 13 Produced item: 44690485
Producer 13 : Sleep for 3 seconds
Process ID: 17 consumed item: -1759265932
Process ID: 11 Produced item: -1759265932
Process ID: 18 consumed item: 44690485
Consumer Thread: 18 : Sleep for 3 seconds
Producer 11 : Sleep for 4 seconds
Consumer Thread: 17 : Sleep for 4 seconds
Process ID: 12 Produced item: -979320697
Producer 12 : Sleep for 3 seconds
Consumer Thread: 16 is consuming
Buffer unavailable -- Producer Thread: 14 is waiting.
Process ID: 14 Produced item: -1726576837
Producer 14 : Sleep for 0 seconds
Consumer Thread: 19 is consuming
Process ID: 19 consumed item: -1726576837
Consumer Thread: 19 : Sleep for 3 seconds
Consumer Thread: 20 is consuming
Process ID: 20 consumed item: 553115334
Consumer Thread: 20 : Sleep for 0 seconds
Buffer unavailable -- Producer Thread: 14 is waiting.
Process ID: 16 consumed item: -979320697
Consumer Thread: 16 : Sleep for 1 seconds
Process ID: 14 Produced item: 553115334
Producer 14 : Sleep for 3 seconds
Consumer Thread: 20 is consuming
Buffer unavailable -- Consumer Thread: 20 is waiting...
Process ID: 15 Produced item: -870865487
Process ID: 20 consumed item: -870865487
Consumer Thread: 20 : Sleep for 0 seconds
Producer 15 : Sleep for 3 seconds
Consumer Thread: 20 is consuming
Buffer unavailable -- Consumer Thread: 20 is waiting...
Consumer Thread: 16 is consuming
Buffer unavailable -- Consumer Thread: 16 is waiting...
Consumer Thread: 18 is consuming
Process ID: 13 Produced item: -857706713
Producer 13 : Sleep for 1 seconds
Process ID: 20 consumed item: -652422566
Process ID: 12 Produced item: -652422566
Consumer Thread: 20 : Sleep for 2 seconds
Process ID: 16 consumed item: -857706713
Consumer Thread: 16 : Sleep for 1 seconds
Buffer unavailable -- Consumer Thread: 18 is waiting...
Producer 12 : Sleep for 0 seconds
Process ID: 12 Produced item: -1545326753
Producer 12 : Sleep for 1 seconds
Process ID: 18 consumed item: -1545326753
Consumer Thread: 18 : Sleep for 0 seconds
Consumer Thread: 18 is consuming
Buffer unavailable -- Consumer Thread: 18 is waiting...
Consumer Thread: 19 is consuming
Consumer Thread: 16 is consuming
Process ID: 11 Produced item: -336156661
Process ID: 19 consumed item: 1333237198
Consumer Thread: 19 : Sleep for 2 seconds
Process ID: 18 consumed item: 161658148
Process ID: 14 Produced item: 1333237198
Producer 14 : Sleep for 4 seconds
Process ID: 13 Produced item: 161658148
Producer 13 : Sleep for 0 seconds
Consumer Thread: 17 is consuming
Consumer Thread: 18 : Sleep for 1 seconds
Producer 11 : Sleep for 1 seconds
Process ID: 16 consumed item: -336156661
Buffer unavailable -- Producer Thread: 12 is waiting.
Consumer Thread: 16 : Sleep for 0 seconds
Process ID: 17 consumed item: -1429142319
Consumer Thread: 17 : Sleep for 4 seconds
Buffer unavailable -- Producer Thread: 13 is waiting.
Process ID: 13 Produced item: -727107136
Consumer Thread: 16 is consuming
Process ID: 16 consumed item: -727107136
Process ID: 12 Produced item: -1429142319
Producer 12 : Sleep for 3 seconds
Consumer Thread: 16 : Sleep for 2 seconds
Producer 13 : Sleep for 2 seconds
Process ID: 15 Produced item: 1410396273
Producer 15 : Sleep for 0 seconds
Buffer unavailable -- Producer Thread: 15 is waiting.
Consumer Thread: 20 is consuming
Process ID: 20 consumed item: 1410396273
Process ID: 15 Produced item: 1072252383
Consumer Thread: 20 : Sleep for 2 seconds
Producer 15 : Sleep for 0 seconds
Buffer unavailable -- Producer Thread: 15 is waiting.
Consumer Thread: 18 is consuming
Buffer unavailable -- Producer Thread: 11 is waiting.
Process ID: 18 consumed item: 1072252383
Consumer Thread: 18 : Sleep for 0 seconds
Process ID: 15 Produced item: 2075385443
Consumer Thread: 18 is consuming
Process ID: 18 consumed item: 2075385443
Process ID: 11 Produced item: -485308674
Producer 11 : Sleep for 3 seconds
Producer 15 : Sleep for 0 seconds
Consumer Thread: 18 : Sleep for 4 seconds
Buffer unavailable -- Producer Thread: 15 is waiting.
Consumer Thread: 16 is consuming
Consumer Thread: 19 is consuming
Process ID: 16 consumed item: -485308674
Process ID: 13 Produced item: 1135562184
Producer 13 : Sleep for 3 seconds
Process ID: 19 consumed item: -1400172302
Consumer Thread: 16 : Sleep for 1 seconds
Process ID: 15 Produced item: -1400172302
Producer 15 : Sleep for 1 seconds
Consumer Thread: 19 : Sleep for 1 seconds

Result 2 Explanation:

In this result, there is likewise a one-to-one correspondence between producers and consumers.
However, waiting times occur because the small buffer size cannot accommodate for the insertion and removal from the 10 processes,
that all want to perform operations in the same one critical section.
Thus, it is the buffer that becomes the bottleneck in this particular scenario.

3) Test Run 3 results (1 producers, 5 consumers, 5 buffer size, 10 second main sleep)

Consumer Thread: 12 : Sleep for 0 seconds
Consumer Thread: 11 : Sleep for 1 seconds
Producer 10 : Sleep for 1 seconds
Consumer Thread: 14 : Sleep for 1 seconds
Consumer Thread: 13 : Sleep for 0 seconds
Consumer Thread: 15 : Sleep for 4 seconds
Consumer Thread: 13 is consuming
Main thread  : Sleep for 10 seconds
Buffer unavailable -- Consumer Thread: 13 is waiting...
Consumer Thread: 12 is consuming
Buffer unavailable -- Consumer Thread: 12 is waiting...
Consumer Thread: 14 is consuming
Consumer Thread: 11 is consuming
Buffer unavailable -- Consumer Thread: 14 is waiting...
Process ID: 10 Produced item: 1294969179
Producer 10 : Sleep for 3 seconds
Buffer unavailable -- Consumer Thread: 11 is waiting...
Process ID: 13 consumed item: 1294969179
Consumer Thread: 13 : Sleep for 1 seconds
Consumer Thread: 13 is consuming
Buffer unavailable -- Consumer Thread: 13 is waiting...
Consumer Thread: 15 is consuming
Process ID: 10 Produced item: 758046609
Process ID: 12 consumed item: 758046609
Buffer unavailable -- Consumer Thread: 15 is waiting...
Producer 10 : Sleep for 0 seconds
Consumer Thread: 12 : Sleep for 4 seconds
Process ID: 10 Produced item: 803704672
Process ID: 13 consumed item: 803704672
Producer 10 : Sleep for 3 seconds
Consumer Thread: 13 : Sleep for 3 seconds
Process ID: 14 consumed item: 2122169425
Process ID: 10 Produced item: 2122169425
Consumer Thread: 14 : Sleep for 4 seconds
Consumer Thread: 13 is consuming
Producer 10 : Sleep for 2 seconds
Buffer unavailable -- Consumer Thread: 13 is waiting...
Consumer Thread: 12 is consuming
Buffer unavailable -- Consumer Thread: 12 is waiting...
Process ID: 10 Produced item: 653376443
Process ID: 11 consumed item: 653376443
Producer 10 : Sleep for 0 seconds
Consumer Thread: 11 : Sleep for 3 seconds
Process ID: 10 Produced item: 1806722040
Producer 10 : Sleep for 2 seconds
Process ID: 13 consumed item: 1806722040
Consumer Thread: 13 : Sleep for 1 seconds

Result 3 Explanation:

In the third scenario, the buffer size has been increased,
ultimately resulting in less wait time even though it still appears.
Again, the buffer size is too small to accommodate the process operations trying to access the same critical section. (6 providers working on 5 slots). 5 consumers waiting for 1 producer results in many consumer waits as opposed to the one Producer. 

4) Test Run 4 results (5 producers, 5 consumers, 10 buffer size, 10 second main sleep)

Producer 13 : Sleep for 1 seconds
Consumer Thread: 19 : Sleep for 0 seconds
Producer 14 : Sleep for 1 seconds
Main thread  : Sleep for 10 seconds
Producer 12 : Sleep for 0 seconds
Consumer Thread: 17 : Sleep for 4 seconds
Consumer Thread: 18 : Sleep for 3 seconds
Consumer Thread: 15 : Sleep for 3 seconds
Producer 11 : Sleep for 2 seconds
Consumer Thread: 16 : Sleep for 2 seconds
Producer 10 : Sleep for 1 seconds
Consumer Thread: 19 is consuming
Buffer unavailable -- Consumer Thread: 19 is waiting...
Process ID: 12 Produced item: 2067149889
Process ID: 19 consumed item: 2067149889
Producer 12 : Sleep for 3 seconds
Consumer Thread: 19 : Sleep for 1 seconds
Consumer Thread: 19 is consuming
Process ID: 10 Produced item: 729989164
Process ID: 13 Produced item: 1921554873
Process ID: 14 Produced item: 458199634
Producer 14 : Sleep for 4 seconds
Producer 13 : Sleep for 3 seconds
Producer 10 : Sleep for 2 seconds
Process ID: 19 consumed item: 458199634
Consumer Thread: 19 : Sleep for 3 seconds
Consumer Thread: 16 is consuming
Process ID: 11 Produced item: 850542297
Process ID: 16 consumed item: 1921554873
Producer 11 : Sleep for 2 seconds
Consumer Thread: 16 : Sleep for 3 seconds
Consumer Thread: 18 is consuming
Process ID: 12 Produced item: 973842709
Process ID: 10 Produced item: 607907446
Consumer Thread: 15 is consuming
Producer 10 : Sleep for 0 seconds
Process ID: 15 consumed item: 850542297
Producer 12 : Sleep for 4 seconds
Process ID: 18 consumed item: 729989164
Consumer Thread: 15 : Sleep for 4 seconds
Process ID: 10 Produced item: 1069262814
Producer 10 : Sleep for 3 seconds
Consumer Thread: 18 : Sleep for 3 seconds
Consumer Thread: 17 is consuming
Process ID: 11 Produced item: 538380200
Process ID: 13 Produced item: 174377602
Producer 13 : Sleep for 2 seconds
Consumer Thread: 19 is consuming
Producer 11 : Sleep for 0 seconds
Process ID: 17 consumed item: 607907446
Process ID: 11 Produced item: 792972155
Process ID: 19 consumed item: 973842709
Producer 11 : Sleep for 0 seconds
Consumer Thread: 17 : Sleep for 3 seconds
Process ID: 11 Produced item: 1356238600
Consumer Thread: 19 : Sleep for 1 seconds
Producer 11 : Sleep for 0 seconds
Buffer unavailable -- Producer Thread: 11 is waiting.
Buffer unavailable -- Producer Thread: 14 is waiting.
Consumer Thread: 16 is consuming
Process ID: 16 consumed item: 1069262814
Consumer Thread: 16 : Sleep for 2 seconds
Process ID: 14 Produced item: 1746455510
Producer 14 : Sleep for 4 seconds
Consumer Thread: 19 is consuming
Process ID: 19 consumed item: 174377602
Consumer Thread: 19 : Sleep for 4 seconds
Process ID: 11 Produced item: 1658701447
Producer 11 : Sleep for 2 seconds
Buffer unavailable -- Producer Thread: 13 is waiting.
Buffer unavailable -- Producer Thread: 10 is waiting.
Consumer Thread: 18 is consuming
Process ID: 18 consumed item: 538380200
Consumer Thread: 18 : Sleep for 0 seconds
Process ID: 10 Produced item: 742850184
Consumer Thread: 18 is consuming
Producer 10 : Sleep for 1 seconds
Process ID: 13 Produced item: 615308600
Process ID: 18 consumed item: 792972155
Producer 13 : Sleep for 3 seconds
Consumer Thread: 18 : Sleep for 4 seconds
Consumer Thread: 17 is consuming
Process ID: 17 consumed item: 1356238600
Consumer Thread: 16 is consuming
Buffer unavailable -- Producer Thread: 12 is waiting.
Buffer unavailable -- Producer Thread: 11 is waiting.
Consumer Thread: 15 is consuming
Buffer unavailable -- Producer Thread: 10 is waiting.
Process ID: 15 consumed item: 1658701447
Process ID: 11 Produced item: 557449090
Process ID: 12 Produced item: 802182364
Process ID: 16 consumed item: 1746455510
Consumer Thread: 17 : Sleep for 2 seconds
Consumer Thread: 16 : Sleep for 1 seconds
Producer 12 : Sleep for 2 seconds
Producer 11 : Sleep for 0 seconds
Consumer Thread: 15 : Sleep for 3 seconds
Process ID: 10 Produced item: 1874533409
Buffer unavailable -- Producer Thread: 11 is waiting.
Producer 10 : Sleep for 2 seconds
Consumer Thread: 16 is consuming
Process ID: 16 consumed item: 742850184
Consumer Thread: 16 : Sleep for 1 seconds
Process ID: 11 Produced item: 92339460
Producer 11 : Sleep for 2 seconds
Consumer Thread: 19 is consuming
Process ID: 19 consumed item: 615308600
Buffer unavailable -- Producer Thread: 13 is waiting.
Buffer unavailable -- Producer Thread: 14 is waiting.
Process ID: 13 Produced item: 2095093062
Producer 13 : Sleep for 4 seconds
Consumer Thread: 19 : Sleep for 0 seconds
Consumer Thread: 19 is consuming
Process ID: 19 consumed item: 802182364
Process ID: 14 Produced item: 2047290069
Consumer Thread: 19 : Sleep for 0 seconds
Producer 14 : Sleep for 0 seconds
Consumer Thread: 19 is consuming
Process ID: 19 consumed item: 557449090
Process ID: 14 Produced item: 1135505153
Producer 14 : Sleep for 0 seconds
Consumer Thread: 19 : Sleep for 1 seconds
Buffer unavailable -- Producer Thread: 14 is waiting.
Consumer Thread: 17 is consuming
Process ID: 17 consumed item: 1874533409
Process ID: 14 Produced item: 121718685
Consumer Thread: 17 : Sleep for 0 seconds
Producer 14 : Sleep for 1 seconds
Consumer Thread: 17 is consuming
Process ID: 17 consumed item: 92339460
Consumer Thread: 17 : Sleep for 0 seconds
Consumer Thread: 17 is consuming
Process ID: 17 consumed item: 2095093062
Consumer Thread: 17 : Sleep for 0 seconds
Consumer Thread: 17 is consuming
Process ID: 17 consumed item: 2047290069
Consumer Thread: 17 : Sleep for 1 seconds
Consumer Thread: 16 is consuming
Process ID: 16 consumed item: 1135505153
Process ID: 12 Produced item: 819686560
Process ID: 10 Produced item: 252296844
Producer 10 : Sleep for 4 seconds
Producer 12 : Sleep for 4 seconds
Consumer Thread: 16 : Sleep for 1 seconds


Result 4 Explanation:

In this last example, the buffer size is no longer the bottleneck. Also, there is an equal amount of Producers and Consumers. This results in the repeated production and consumption of items without long waiting times because there is an even balance of both processes. 


