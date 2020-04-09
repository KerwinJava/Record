## SPRINGBOOT在LOGBACK.XML中读取APPLICATION.PROPERTIES中配置的日志路径
1、在springboot项目中使用logback记录日志，在logback.xml中配置日志存储位置时读取application.properties中配置的路径，在 logback.xml中配置引用如下：
```javascript
<property name="log.path" value="${path.log}"/>
```
发现读取不到

2、原因：因为logback.xml的加载顺序早于springboot的application.yml (或application.properties) 配置文件当然读不到application.yml（或application.properties）文件中的值了

3、解决方案：需要通过springProperty标签来引用：
```javascript
<springProperty scope="context" name="log.path" source="path.log"/>
```
