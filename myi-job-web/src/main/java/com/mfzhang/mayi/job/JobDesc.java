package com.mfzhang.mayi.job;

/**
 * 1、
 * Scheduler, 调度容器，调度容器中可以注册多个JobDetail 和 Trigger
 * Trigger, 调度参数的配置
 * JobDetail, 具体的可执行的调度程序，Job是该调度程序要执行的内容
 * Job, 一个工作，要执行的具体内容
 * 
 * 2、主要api接口：
 * Job，由调度程序执行；
 * JobDetai，调度程序，定义作业实例，执行Job；
 * Trigger，触发器，定义执行Job的计划（如，每天1点执行）；
 * Scheduler，与调度程序JobDetail交互的主要API；
 * JobBuilder，定义/构建JobDetail实例，定义作业Job的实例；
 * TriggerBuilder，定义/构建触发器实例；
 * 
 * 3、Scheduler的生命期：
 * 从SchedulerFactory创建它时开始，到Scheduler调用shutdown()方法时结束
 * 
 * 4、DSL，Domain Specific Language 领域特定语言
 * Quartz提供的“builder”类，可以认为是一种领域特定语言
 * 
 * 5、Job生命周期：
 * 每次当scheduler执行Job时，在调用其execute(…)方法之前会创建该Job类的一个新的实例；
 * 执行完毕，对该Job实例的引用就被丢弃了，Job实例会被垃圾回收；
 * 造成后果：Job必须有一个无参的构造函数（当使用默认的JobFactory时）；
 * 在job类中，不应该定义有状态的数据属性，因为在job的多次执行中，这些属性的值不会保留；
 * 
 * 6、JobDataMap
 * JobDataMap中可以包含不限量的（序列化的）数据对象，在job实例执行的时候，可以使用其中的数据；
 * 在决定JobDataMap中存放什么数据的时候需要小心，因为JobDataMap中存储的对象都会被序列化，因此很可能会导致类的版本不一致的问题；
 * 如果你在job类中，为JobDataMap中存储的数据的key增加set方法，那么Quartz的默认JobFactory实现在job被实例化的时候会自动调用这些set方法，
 * 这样你就不需要在execute()方法中显式地从map中取数据了；
 * 
 * 7、Job 和 JobDetail
 * 一个Job实现类，可以创建与该Job类关联的多个JobDetail类，每个JobDetail实例都有自己的属性集和JobDataMap；
 * 当一个trigger被触发时，与之关联的JobDetail实例会被加载，JobDetail引用的job类通过配置在Scheduler上的JobFactory进行初始化；
 * 一般说Job是指代JobDetail，一般说Job接口的实现类是指代Job类；
 *
 * @author Guo YL 2017年11月8日 下午8:49:48
 */
public interface JobDesc {

}
