## Data-driven Pipeline Framework
[Based on the lecture by Dr. Pearce](http://www.cs.sjsu.edu/faculty/pearce/modules/patterns/distArch/pipeline.htm)

A pipeline framework consists of 3 main things:
* Pipe
* Filter
* Message

### Pipe
A pipe is a message queue.

### Message
A message can be anything. 

### Filter
A filter is a process, thread, or other component that perpetually reads messages from an input pipe, one at a time, processes each message, then writes the result to an output pipe. Thus, it is possible to form pipelines of filters connected by pipes.

The collaboration of pipes, filters and messages is what constitutes the pipeline framework.

In a Data-driven Pipeline Framework, the Filters are passive. When notified, a filter reads a single message from its input pipe, process the message, then writes the processed message to its output pipe.

The filter sub-classes (`Producer`, `Transformer`, `Tester`, and `Consumer`) are `abstract`. Users must extend them and provide implementations of the corresponding processing methods: produce, transform, test, and consume.

A pipe has the capacity to hold a single message.

Producers and consumers have start() methods. A start() method contains a perpetual loop that drives the pipeline until the producer runs out of data. The consumer's start method drives a demand-driven pipeline, while the producer's start method drives a data-driven pipeline.

In this case, the producer will have a `start()` since this is a data driven pipeline framework.


A message is an object with three fields:
* quit: Boolean - tells a demand-driven consumer that the producer has no more data
* fail: Boolean - indicates that a message failed a test and should be ignored
* content: T 	- the content of the message, where T is a type parameter  

It's important that filters not depend on each other. When this is true, a filter can be reused in other pipelines. To make this true the Publisher-Subscriber design pattern is used. The `Pipe` generalizes from `Publisher` class and the `Filter`s realize the `Subscriber` interface. 


### TODOS:
* To prevent users from mixing pipes and filters with different values for the type parameter, T, use the Abstract Factory Pattern or the Builder Pattern.

