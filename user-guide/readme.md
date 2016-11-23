This is a mirror of the [wiki user guide](https://github.com/aol/cyclops-react/wiki/Home/) may not always be up-to-date.
- [Getting Started](#gettingStarted)
- [Some common features](#common)
- [Collections](#collections)
- [Functions](#functions)
	- [An Introduction](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/lambdas.adoc)
		- [to FluentFunctions](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/lambdas.adoc#_fluentfunctions)
		- [to Mutable](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/lambdas.adoc#_mutable)
		- [to LazyMutable](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/lambdas.adoc#_lazyimmutable)
		- [to ExceptionSoftener](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/lambdas.adoc#_exceptionsoftener)
		- [to Memoization](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/lambdas.adoc#_memoization)
		- [to Currying and Uncurrying](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/lambdas.adoc#_currying_uncurrying)
		- [to Partial Application](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/lambdas.adoc#_partial_application)
		- [to Type Inferencing](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/lambdas.adoc#_type_inferencing)
	- [More Functions](#functions)
- [Control Structures](#control)
	- [Structural Pattern matching and the visitor pattern](#patternMatching)
		- [An introduction](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/pattern-matching.adoc)
			- [to is/has](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/pattern-matching.adoc#_is_has)
			- [to when/then/otherwise](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/pattern-matching.adoc#_when_then_otherwise_syntax)
			- [to compositional predicates](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/pattern-matching.adoc#_compositional_predicates)
			- [to recursive matching of data types](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/pattern-matching.adoc#_recursive_matching_of_datatypes)
			- [to guard based recursive matching](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/pattern-matching.adoc#_guard_based_recursive_matching)
			- [to structural based recursive matching](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/pattern-matching.adoc#_structural_recursive_matching)
			- [to structural matching on JDK classes](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/pattern-matching.adoc#_structural_matching_on_jdk_classes)
		- [More Pattern matching and the visitor pattern](#patternMatching)
	- [Combiners (Monoids & Semigroups)](#combiners)
	- [Futures : Asynchronous execution](#asyncExec)
	- [Eval : Lazy Evaluation](#lazyEval)
	- [Trampoline : Recursion](#recursion)
	- [Sum Types (Try, Xor, Maybe, FeatureToggle, Optionals)](#sum)
	- [Product types (Tuples)](#product)
	- [Product & Sum types (Ior)](#productAndSum)
	- [AnyM - a functor for Monads](#anyM)
	- [For : for comprehensions api](#forApi)
	- [Reader : Functional Dependency Injection](#reader)
- [Reactive Streams](#reactiveStreams)
	- [Reactive Streams Publishers](#rsPublishers)
	- [Reactive Streams Subscribers](#rsSubscribers)
- [Streaming](#streaming)
	- [An Introduction](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/streams.adoc)
		- [to StreamUtils](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/streams.adoc#_introduction_to_streamutils)
		- [to Streamable](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/streams.adoc#_introduction_to_streamable)
		- [to Streamable](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/streams.adoc#_introduction_to_reactiveseq)
		- [to HotStreams](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/streams.adoc#_hotstreams)
		- [to Reactive Streams](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/streams.adoc#_reactive_streams)
		- [to sliding and grouping](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/streams.adoc#_batching_windowing_and_sliding_views)
		- [to value extraction](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/streams.adoc#_value_extraction)
		- [to error handling](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/streams.adoc#_error_handling)
		- [to scheduling](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/streams.adoc#_scheduling)
		- [to time ops / onePer / debounce](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/streams.adoc#_time_based_operators)
		- [to zipping](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/streams.adoc#_zipping)
		- [to efficient reversal](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/streams.adoc#_efficient_reversal)
		- [to take / drop / cycle](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/streams.adoc#_limit_skip_take_drop_cycle)
		- [to flatMap ops](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/streams.adoc#_flatmap_operators_flatten)
		- [to map ops](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/streams.adoc#_map_operators_map_cast)
		- [to for comprehensions](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/streams.adoc#_for_comprehensions)
		- [to empty stream handling](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/streams.adoc#_empty_stream_handling)
		- [to stream with a single value](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/streams.adoc#_stream_with_a_single_value)
		- [to alt filter ops](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/streams.adoc#_filtering_filter_remove_oftype)
		- [to scanLeft / scanRight](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/streams.adoc#_scanleft_scanright)
		- [to assertions](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/streams.adoc#_assertions)
		- [to folds](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/streams.adoc#_foldleft_foldright_join_reduce)
		- [to conversions](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/streams.adoc#_conversions)
		- [to async ops](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/streams.adoc#_async_terminal_operations)
	- [Performance](#performance)
	- [Pushing data into Streams](#pushing)
		- [StreamSource](#streamSource)
		- [Pipes](#pipes)
	- [Repeatable Streams (Streamable)](#repeating)
	- [Plumbing Streams](#plumbing)
		- [Backpressure](#backpressure)
	- [SQL Window functions (and more) inherited from jooλ](#jooλ) 
	- [ReactiveSeq (powerful sequential Streaming)](#reactiveSeq)
	- [FutureStreams](#futureStreams)
		- [Operators](#fsOperators)
			- [The tutorial (with videos)](#fsTutorial)
			- [Examples](#fsExamples)
		- [FutureStream concepts](#fsConcepts)
			- [Performance](#fsPerformance)
			- [Acting on Futures or Acting on Results](#fsActingOnFutures)
			- [Configuration](#fsConfiguration)
- [Monad transformers via AnyM](#monadTransformers)
- [Type Interfaces in cyclops-react](#typeInterfaces)
- [Low level For Comprehensions](#forComp)
- [Higher Kinded Types](#hkt)
- [Type classes](#typeClasses)
- [Integrations](#integrations)
- [Functional & Reactive Microservices](#microservices)

# <a name="gettingStarted">Getting Started

* [Adding cyclops-react dependency](https://github.com/aol/cyclops-react/wiki/Adding-cyclops-react-as-a-dependency)
* [Adding the legacy cyclops-modules](https://github.com/aol/cyclops/wiki/A-guide-to-using-cyclops-as-independent-modules)

# <a name="common">Some common features

* [custom conversions and operators](https://github.com/aol/cyclops-react/wiki/Custom-operators-and-type-conversions) Available on all types.
* [Predicates for filtering](https://github.com/aol/cyclops-react/wiki/Predicates)

# <a name="collections">Collections

* [Working with persistent and mutable collections](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/Collections.adoc)
* [Lazy Extended Collections](https://medium.com/@johnmcclean/faster-lazy-extended-powerful-jdk-collections-5a519ab582ae#.m6cbebjs5) - Fast and powerful
* [Extending JDK 8 Collections](https://medium.com/@johnmcclean/extending-jdk-8-collections-8ae8d43dd75e#.3grjedpnb)

# <a name="functions">Functions

* [Working with Lambdas](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/lambdas.adoc)
* [Fluent Functions in cyclops](https://medium.com/@johnmcclean/can-we-make-working-with-functions-easier-in-java-8-81ed9d1050f2#.ebtvdy31s) - blog post
* [Convertable mixin](https://github.com/aol/cyclops/wiki/cyclops-closures-:-Convertable-mixin)
* [Mutable boxes](https://github.com/aol/cyclops/wiki/cyclops-closures-%3A-Mutable--for--managing-and---mutating-mutable-variables/_edit)
* [LazyImmutable set once box](https://github.com/aol/cyclops/wiki/cyclops-closures-:-Lazy-Immutable---a-wrapping-class-for-setOnce-values)
* [Memoization](https://github.com/aol/cyclops/wiki/Caching-method-calls)
* [Partial Application](https://github.com/aol/cyclops/wiki/cyclops-functions-:-Partial-Application)
* [Exception Softener](https://github.com/aol/cyclops/wiki/cyclops-invoke-dynamic-:-ExceptionSoftener)
* [Utilities for working with Functions](https://github.com/aol/cyclops/wiki/Utilities-for-working-with-Java-8-Functions)
* [Memoization, Currying, Uncurrying and Type inferencing](https://github.com/aol/cyclops/wiki/Memoisation,-Currying,-Uncurrying-and-Type-Inferencing)
* [4 flavours of Java 8 Functons](https://medium.com/@johnmcclean/4-flavours-of-java-8-functions-6cafbcf5bb4f#.h29gipajc) Blog post

# <a name="control">Control Structures

## <a name="patternMatching">Pattern matching and the visitor pattern

* [Built-in Visitor pattern](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/visitor-pattern.adoc)
* [Structural Pattern matching](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/pattern-matching.adoc)
* [Matchables pre-canned matching](https://github.com/aol/cyclops-react/wiki/Matchables)
* [Predicates for guards](https://github.com/aol/cyclops-react/wiki/Predicates)
* [Straightforward Structural Pattern Matching](https://medium.com/about-java/straightforward-structural-pattern-matching-d77155bac8da#.ibyghe671) - blog post

## <a name="combiners">Combiners

* [Monoids & Semigroups](https://github.com/aol/cyclops-react/wiki/Monoids-&-Semigroups)

## <a name="asyncExec">Asynchronous execution

* [CompletableFutures for working with CompletableFutues](https://github.com/aol/cyclops-react/wiki/CompletableFutures)
* [FutureW - a better CompletableFuture API](https://github.com/aol/cyclops-react/wiki/FutureW)

## <a name="lazyEval">Lazy Evaluation

* [Eval - monadic, tail recursive, lazy evaluation with caching](https://github.com/aol/cyclops-react/wiki/Eval)
* [Brief introduction to Eval](https://docs.google.com/presentation/d/1vqaangBCl9ibzewE7KXzMhevjmMWBrAgJixi5cOqb_A/edit?usp=sharing)

## <a name="recursion">Recursion

* [Trampoline](https://github.com/aol/cyclops/wiki/Trampoline-:-Stackless-Recursion-for-Java-8)
* [Trampolining: a practical guide for awesome Java Developers](https://medium.com/@johnmcclean/trampolining-a-practical-guide-for-awesome-java-developers-4b657d9c3076#.ecg7agr07)

## <a name="sum">Sum Types (Try, Xor, Maybe, FeatureToggle)

* [Try functional exception handling for Java 8](https://github.com/aol/cyclops/wiki/Try-:-functional-exception-handling-for-Java-8)
* [Why cyclops-react Try](http://softwareengineering.stackexchange.com/a/319440/229756)
* [Try examples](https://github.com/aol/cyclops/wiki/Try-examples)
* [When Functional Try outperforms Try / Catch](https://medium.com/@johnmcclean/when-functional-try-outperforms-try-catch-c44e83ec7939#.mkmc0ihgq)
* [Feature Toggling](https://github.com/aol/cyclops/wiki/Enable-and-disable-production-features)
* [Feature Toggling with cyclops](https://medium.com/@johnmcclean/feature-toggling-with-cyclops-a29d1eead62c#.gqc0z6b2h) Blog post
* [Maybe: A lazy tail-recursive version of Optional](https://medium.com/@johnmcclean/future-java-today-9eef0e4dd126#.7274sd23t)
* [Working with Optionals](https://github.com/aol/cyclops-react/wiki/Optionals)
* [Validator : lazy active validator, works with Xor](https://github.com/aol/cyclops-react/wiki/Validator)
* [Xor : exclusive Or, a right biased Either type](https://github.com/aol/cyclops-react/wiki/Xor)

## <a name="product">Product types (Tuples)

* [Tuples from jOOλ](http://www.jooq.org/products/jOO%CE%BB/javadoc/0.9.11/org/jooq/lambda/tuple/package-frame.html): Javadoc link. cyclops-react extends jooλ
* [Power Tuples independent cyclops module](https://github.com/aol/cyclops/wiki/Power-Tuples)

## <a name="productAndSum">Product & Sum types

* [Ior](https://github.com/aol/cyclops-react/wiki/Ior)

## <a name="anyM">Abstract over monads (AnyM)

AnyM is a functor for Monads, with two monadic sub-types. AnyMValue a monad for monadic values. AnyMSeq a monad for non-scalar monads.

* [AnyM intro](https://github.com/aol/cyclops-react/wiki/AnyM)
* [AnyM creational methods](https://github.com/aol/cyclops/wiki/cyclops-moand-api-:-Creating-an-instanceof-AnyM)
* [AnyM for comprehensions](https://github.com/aol/cyclops/wiki/cyclops-monad-api-:---AnyM---for-comprehension-operators-(forEach2,-forEach3))
* [Introduction to the cyclops-monad API](https://medium.com/@johnmcclean/introducing-the-cyclops-monad-api-a7a6b7967f4d#.7r6hyotds)
* [cyclops-react organizes the cambrian expolsion of Java 8 libraries](https://blog.jooq.org/2016/05/12/cyclops-react-organises-the-cambrian-explosion-of-java-8-libraries/)

## <a name="forApi">For comprehension API

* [For intro](https://github.com/aol/cyclops-react/wiki/For)

Related : For Comprehensions in Scala

* [Sequence comprehensions in Scala](http://docs.scala-lang.org/tutorials/tour/sequence-comprehensions.html)
* [How does Yield work?](http://docs.scala-lang.org/tutorials/FAQ/yield.html)

Compose your own

* [Low level For Comprehensions](#forComp)

## <a name="reader">Reader monad

* [Reader functional dependency injection](https://github.com/aol/cyclops-react/wiki/Reader-:-functional-dependency-injection)

# <a name="reactiveStreams">Reactive Streams

## <a name="rsSubscribers">Reactive Streams Publishers

All cyclops-react data types implement Reactive Streams Publisher (e.g. extended collections, AnyM, Xor, Ior, Try, Maybe, FutureW, ReactiveSeq, LazyFutureStream and more).

* [Example : Reactive Streams Publisher & Subscriber](https://github.com/aol/cyclops-react/wiki/A-Reactive-Streams-Publisher-or-Subscriber)

## <a name="rsSubscribers">Reactive Streams Subscribers

* [ValueSubscriber - subscribe for a single value](https://github.com/aol/cyclops-react/wiki/Reactive-Streams-:-ValueSubscriber)

# <a name="streaming">Streaming


* [Introduction to cyclops-react Streams](http://gist.asciidoctor.org/?github-aol/simple-react//user-guide/streams.adoc))
* [Streaming overview](https://github.com/aol/cyclops/wiki/Streams-in-cyclops-overview) : ReactiveSeq, Streamable and more
* [A rational : Java 8 Streams 10 missing features](https://medium.com/@johnmcclean/java-8-streams-10-missing-features-ec82ee90b6c0)


## <a name="performance">Performance

* [Optimizing cyclops-react Streams](https://medium.com/@johnmcclean/optimizing-simple-react-streams-30b6929fafeb#.dfdqwc7tv)
* [Fast Futures and Fast Future Pooling](https://github.com/aol/cyclops-react/wiki/FastFutures-and-FastFuture-Pooling) : Fast Futures ~2.5 faster than CompletableFutures in LazyFutureStreams

## <a name="pushing">Pushing data into Streams

* [Stackoverflow answer showing how to do it with Queues](http://stackoverflow.com/a/28967294)

## <a name="streamSource">StreamSource

* [StreamSource](https://github.com/aol/cyclops-react/wiki/StreamSource) for pushable Streams
* [Pushing data into Java 8 Streams](http://jroller.com/ie/entry/pushing_data_into_java_8) - blog entry

## <a name="streamSource">Pipes

* [Pipes event bus](https://github.com/aol/cyclops-react/wiki/Pipes-:-an-event-bus)

## <a name="repeatable">Repeatable Streams (Streamable)

* [Streamable](https://github.com/aol/cyclops/wiki/cyclops-streams-:-Streamable)
* [Streamable as a mixin](https://github.com/aol/cyclops/wiki/Mixins-:-Streamable)

## <a name="plumbing">Plumbing Streams

* [Queues explained](https://github.com/aol/cyclops-react/wiki/Queues-explained)
* [Signals explained](https://github.com/aol/cyclops-react/wiki/Signals-Explained)
* [Topics explained](https://github.com/aol/cyclops-react/wiki/Topics-Explained)
* [Plumbing Streams with Queues, Topics and Signals](https://medium.com/@johnmcclean/plumbing-java-8-streams-with-queues-topics-and-signals-d9a71eafbbcc#.fbwoae34f)
* [Agrona wait free Queues ](https://github.com/aol/cyclops-react/wiki/Agrona-Wait-Free-Queues)
* [Wait strategies for working with Wait Free Queues](https://github.com/aol/cyclops-react/wiki/Wait-Strategies-for-working-with-Wait-Free-Queues)

### <a name="backpressure">Backpressure

* [Applying Backpressure across Streams](https://medium.com/@johnmcclean/applying-back-pressure-across-streams-f8185ad57f3a#.szymzi9nj)

## <a name="jooλ">Features inherited from jooλ 

ReactiveSeq & LazyFutureStream extend jooλ's Seq. Extended Collections implement jooλ Collection API.

* [Rationale for Seq](https://blog.jooq.org/2014/09/10/when-the-java-8-streams-api-is-not-enough/)
* [Combining collectors](https://blog.jooq.org/2016/08/29/using-joo%CE%BB-to-combine-several-java-8-collectors-into-one/)
* [Windowing functions in Java](https://blog.jooq.org/2016/01/06/2016-will-be-the-year-remembered-as-when-java-finally-had-window-functions/)
* [Windowing functions example](https://blog.jooq.org/2016/01/26/how-to-pattern-match-files-and-display-adjacent-lines-in-java/)
* [Group by and SQL Aggregrations in Java 8](https://blog.jooq.org/2015/01/23/how-to-translate-sql-group-by-and-aggregations-to-java-8/)
* [Generating an Alphbetical sequence](https://blog.jooq.org/2015/09/09/how-to-use-java-8-functional-programming-to-generate-an-alphabetic-sequence/)
* [Common SQL clauses Stream equivalents](https://blog.jooq.org/2015/08/13/common-sql-clauses-and-their-equivalents-in-java-8-streams/)
* [jooq blog on jooλ](https://blog.jooq.org/tag/joo%CE%BB/)

## <a name="reactiveSeq">ReactiveSeq (powerful sequential Streaming)

* [Scheduling Streams](https://github.com/aol/cyclops/wiki/cyclops-streams-:-Scheduling-Streams-(ReactiveSeq,--jOO%CE%BB--Javaslang-JDK))
* [Scheduling Streams example](https://medium.com/@johnmcclean/how-to-schedule-emission-from-a-stream-in-java-aa2dafda7c07#.6se0q2fpw) blog post
* [Asynchronous execution](https://github.com/aol/cyclops/wiki/cyclops-streams-:-Asynchronous-Terminal-Operations)
* [For comprehensions](https://github.com/aol/cyclops/wiki/cyclops-streams---ReactiveSeq---for-comprehension-operators-(forEach2,-forEach3))
* [ReactiveSeq examples](https://github.com/aol/cyclops/wiki/cyclops-streams-%3A-Streaming-examples/_edit)

## <a name="futureStreams">FutureStreams

* [LazyFutureStream overview](https://github.com/aol/cyclops-react/wiki/LazyFutureStream) : A powerful API for infinite parallel Streaming
* [SimpleReactStream overview](https://github.com/aol/cyclops-react/wiki/1.-simple-react-overview) : an easy to use API for finite eager parellel Streaming
* [LazyFutureStream & reactive-streams](https://github.com/aol/cyclops-react/wiki/A-Reactive-Streams-Publisher-or-Subscriber)
* [A simple API (simple-react) and a rich api (LazyFutureStream](https://github.com/aol/cyclops-react/wiki/A-simple-API,-and-a-Rich-API)
* [Asynchronous terminal operations](https://github.com/aol/cyclops-react/wiki/Asynchronous-terminal-operations)

### <a name="fsOperators">Operators

* [Batching, time control, sharding, zipping](https://github.com/aol/cyclops-react/wiki/Batching,-Time-Control,-Sharding-and-Zipping-Operators)
* [onFail](https://github.com/aol/cyclops-react/wiki/Error-handling-with-onFail)
* [Event based : forEachWithError etc](https://github.com/aol/cyclops-react/wiki/Reactive-Tasks-:-reactive-streams-based-operators)
* [For comprehensions](https://github.com/aol/cyclops-react/wiki/for-comprehensions-within-a-Stream)
* [Retry](https://github.com/aol/cyclops-react/wiki/Retry-functionality-in-SimpleReact)
* [Take, Skip and Sample](https://github.com/aol/cyclops-react/wiki/Take,-Skip-and-Sample)
* [Scheduling](https://github.com/aol/cyclops-react/wiki/Scheduling-Streams)

#### <a name="fsTutorial">The tutorial (with videos)

* [getting started](https://medium.com/@johnmcclean/reactive-programming-with-java-8-and-simple-react-getting-started-b2e34a5f80db#.ablu1d3y4)
* [error handling](https://medium.com/@johnmcclean/reactive-programming-with-java-8-and-simple-react-error-handling-b184b2197c7e)
* [filter /map/ reduce /flatMap](https://medium.com/@johnmcclean/reactive-programming-with-java-8-and-simple-react-filter-map-reduce-flatmap-ce5a557ad2d4)
* [choosing a stream type](https://medium.com/@johnmcclean/reactive-programming-with-java-8-and-simple-react-choosing-a-stream-type-c24dc4dab1af)
* [stream creation](https://medium.com/@johnmcclean/reactive-programming-with-java-8-and-simple-react-stream-creation-4f9918e768e5)
* [pooling reactors](https://medium.com/@johnmcclean/reactive-programming-with-java-8-and-simple-react-pooling-reactors-bf6ae2c0a23b)
* [pull / push model](https://medium.com/@johnmcclean/reactive-programming-with-java-8-and-simple-react-pull-push-model-70751d63628f)
* [flow control](https://medium.com/@johnmcclean/reactive-programming-with-java-8-and-simple-react-flow-control-d2e713b843a9)
* [batching and chunking](https://medium.com/@johnmcclean/reactive-programming-with-java-8-and-simple-react-batching-and-chunking-ecac62ce8bec)
* [sharding](https://medium.com/@johnmcclean/reactive-programming-with-java-8-and-simple-react-sharding-c766019153b5)
* [zipping streams](https://medium.com/@johnmcclean/reactive-programming-with-java-8-and-simple-react-zipping-streams-ed6579c5bbf7)
* [firstOf, anyOf, allOf](https://medium.com/@johnmcclean/reactive-programming-with-java-8-and-simple-react-firstof-allof-anyof-293298273364)
* [stream operations](https://medium.com/@johnmcclean/reactive-programming-with-java-8-and-simple-react-stream-operations-4e79df564735#.omuvs8b7d)
* [sequence operations](https://medium.com/@johnmcclean/reactive-programming-with-java-8-and-simple-react-sequence-operations-88e36032245f)

#### <a name="fsExamples">Examples

* [Getting started example](https://github.com/aol/cyclops-react/wiki/Getting-started-with-a-simple-example)
* [Building a non-blocking NIO Rest Client](https://github.com/aol/cyclops-react/wiki/Example-:-Building-a-non-blocking-NIO-rest-client)
* [Bulk loading files](https://github.com/aol/cyclops-react/wiki/Example-:-Bulk-loading-files)
* [Converting examples from RxJava](https://github.com/aol/cyclops-react/wiki/Example-:-Converting-examples-from-RxJava)
* [Implementing a data cache](https://github.com/aol/cyclops-react/wiki/Example-:-Implementing-a-data-cache)
* [Implementing a Quorum](https://github.com/aol/cyclops-react/wiki/Example-:-Implementing-a-Quorum)
* [Reacting to asynchronous events with a Stream of CompletableFutures](https://github.com/aol/cyclops-react/wiki/Example-:-Reacting-to-Asynchronous-Events-with-a-Stream-of-CompletableFutures)
* [Selecting the fastest algorithm](https://github.com/aol/cyclops-react/wiki/Example-:-Selecting-the-fastest-algorithm---result)
* [Asynchronous fun with Vert.x](https://medium.com/@johnmcclean/asynchronous-fun-with-vert-x-and-cyclops-react-6fcc6557fe03#.svs5aai84)
* [JDBC Processing](https://medium.com/@johnmcclean/jdbc-processing-options-with-cyclops-react-49d62b02f775#.9cqwlbzf1)


### <a name="fsConcepts">FutureStream concepts

* [Understanding LazyFutureStreams behavior](https://github.com/aol/cyclops-react/wiki/Understanding-LazyFutureStreams-behaviour)
* [Quick overview of SimpleReactStream](https://github.com/aol/cyclops-react/wiki/What-does-SimpleReact-do%3F)
* [Understanding the push-pull model of FutureStreams](https://github.com/aol/cyclops-react/wiki/Understanding-the-pull---push-model-of-simple-react)
* [Let the illusion die](https://medium.com/@johnmcclean/let-the-illusion-die-ad2318282bf8#.x90xktmqe) Build your own FutureStreams
* [FutureStream comparison matrix](https://github.com/aol/cyclops-react/wiki/Feature-comparison-matrix) : note EagerFutureStream is discontinued

#### <a name="fsPerformance">Performance

* [Automatic optimization](https://github.com/aol/cyclops-react/wiki/Automatic-Optimization-%5BautoOptimize%5D)
* [Async vs sync **future** execution](https://github.com/aol/cyclops-react/wiki/async-and-sync-execution)
* [Automemoize](https://github.com/aol/cyclops-react/wiki/autoMemoize-(automatic-caching))

#### <a name="actingOnFutures">Acting on Futures or Acting on Results

* [Operating on futures](https://github.com/aol/cyclops-react/wiki/LazyFutureStream-operations-on-underlying-futures)
* [Acting on Futures](https://github.com/aol/cyclops-react/wiki/Acting-on-Futures-(actOnFutures-operator))

#### <a name="fsConfiguration">Configuration

* [React pools - elastic thread pools](https://github.com/aol/cyclops-react/wiki/ReactPools)
* [Fine Tuning SimpleReact](https://github.com/aol/cyclops-react/wiki/Fine-tuning-SimpleReact)
* [Sharing a forkJoinPool with Parallel Streams](https://github.com/aol/cyclops-react/wiki/Sharing-a-ForkJoinPool-with-ParallelStreams) - info purposes, don't do this!
* [Separating task executors](https://github.com/aol/cyclops-react/wiki/Separating-Task-Executors)


#  <a name="monadTransformers">Monad transformers via AnyM

[AnyM Refresher](https://github.com/aol/cyclops-react/wiki/AnyM)

* [ListT example](https://github.com/aol/cyclops-react/wiki/ListT)
* [OptionalT example](https://github.com/aol/cyclops-react/wiki/OptionalT)
* [MaybeT example](https://github.com/aol/cyclops-react/wiki/MaybeT)
* [FutureWT example](https://github.com/aol/cyclops-react/wiki/FutureWT)
* [CompletableFutureT](https://github.com/aol/cyclops-react/wiki/CompletableFutureT)

#  <a name="typeInterfaces">Type Interfaces in cyclops-react

cyclops-react Types are defined in the [types](http://static.javadoc.io/com.aol.simplereact/cyclops-react/1.0.2/com/aol/cyclops/types/package-frame.html) package and sub-packages

* [ApplicativeFunctor](https://github.com/aol/cyclops-react/wiki/Type-Interfaces-:-ApplicativeFunctor)
* [Filterable](https://github.com/aol/cyclops-react/wiki/Type-Interfaces-:-Filterable)
* [Foldable](https://github.com/aol/cyclops-react/wiki/Type-Interfaces-:-Foldable)
* [Functor](https://github.com/aol/cyclops-react/wiki/Type-Interfaces-:-Functor)
* [MonadicValue](https://github.com/aol/cyclops-react/wiki/Type-Interfaces-:-MonadicValue)
* [MonadicValue1](https://github.com/aol/cyclops-react/wiki/Type-Interfaces-:-MonadicValue1)
* [MonadicValue2](https://github.com/aol/cyclops-react/wiki/Type-Interfaces-:-MonadicValue2)
* [PausableHotStream](https://github.com/aol/cyclops-react/wiki/Type-Interfaces-:-PausableHotStream)
* [To](https://github.com/aol/cyclops-react/wiki/Type-Interfaces-:-To)
* [Traversable](https://github.com/aol/cyclops-react/wiki/Type-Interfaces-:-Traversable)
* [Value](https://github.com/aol/cyclops-react/wiki/Type-Interfaces-:-Value)
* [Visitable](https://github.com/aol/cyclops-react/wiki/Type-Interfaces-:-Visitable)
* [Zippable](https://github.com/aol/cyclops-react/wiki/Type-Interfaces-:-Zippable)

# <a name="forComp">For Comprehension Mechanics

Using the cyclops-react Do builder. In general prefer using com.aol.cyclops.control.For to the lower level Do. Do is useful for building your own For Comprehension interpreter (see [For intro](https://github.com/aol/cyclops-react/wiki/For).

* [Extensible for comprehensions](https://github.com/aol/cyclops/wiki/Extensible-For-Comprehensions-for-Java-8) : used to build type specific For Comprehensions elsewhere
* [For Comprehensions explained](https://github.com/aol/cyclops/wiki/For-Comprehensions-Explained)
* [The neophytes guide to Java 8 : Welcome to the Future](https://medium.com/@johnmcclean/neophytes-guide-to-java-8-welcome-to-the-future-83f432ce82a9#.imr0kl369) - the syntax is better today
* [Dependency injection with the Reader monad](https://medium.com/@johnmcclean/dependency-injection-using-the-reader-monad-in-java8-9056d9501c75#.gx6jrizbx) - cyclops now has it's own Reader monad.

# <a name="hkt">Higher Kinded Types

* [Higher Kinded Types in cyclops](https://github.com/aol/cyclops/wiki/Higher-Kinded-Types)

# <a name="typeClasses">Type classes 

[monad,applicative, functor, unit, monadPlus based on HKT]

* [Type classes](https://github.com/aol/cyclops/wiki/Type-classes)

# <a name="integrations">Integrations

Integrations include

1. AnyM support
2. For comprehension support
3. Higher Kinded Type encodings for 3rd party libraries
4. Lazy / faster collections by taking advantage of strengths of each library

* [Javaslang](https://github.com/aol/cyclops/blob/master/cyclops-javaslang/readme.md)
* [Guava](https://github.com/aol/cyclops/blob/master/cyclops-guava/readme.md)
* [Functional Java](https://github.com/aol/cyclops/blob/master/cyclops-functionaljava/readme.md)
* [RxJava](https://github.com/aol/cyclops/blob/master/cyclops-rx/readme.md)
* [Reactor](https://github.com/aol/cyclops/blob/master/cyclops-reactor/readme.md)

# <a name="microservices">Functional & Reactive Microservices

* [Microserver : micro-reactive](https://github.com/aol/micro-server/blob/master/micro-reactive/readme.md)