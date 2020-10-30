# Java-SPI-Demo

关键点
resources
  META-INF
    services
      com.spi.IOne
      com.spi.IOne2
      
说明
MEATA-INF
  services
  
1、路径为约定改路径为java固定的格式路径
2、services下对应的就是了包路径+类（接口）
3、文件里写的都是对应这个接口的实现类，多个实现类换行
  例如：
      com.spi.OneImpl
      com.spi.OneImpl2
      
      
原理其实比较的简单
  项目启动时，java 会加载METE-INF/services下的所有文件（当然不存在的类自动被抛弃）；然后在读取内容；最后通过ServiceLoader.load提供的工具类进行反射。
  实现了动态机制
