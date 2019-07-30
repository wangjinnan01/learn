package cn.offcn.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {
	
	public static void main(String[] args) throws Exception {
		//putPropertiesData();
		//addPropertiesData();
		loadPropertiesData();
	}
	
	
	public static void loadPropertiesData() throws Exception {
		Properties pp=new Properties();
		FileReader reader=new FileReader("aaa.properties");
		pp.load(reader);
		
		//设置属性值
		pp.setProperty("name", "wangwu");
		pp.setProperty("bookAuthor", "zhaoliu");
		
		
		//遍历属性列表
		Set<String> names=pp.stringPropertyNames();
		for(String name : names) {
			System.out.println(name+"="+pp.getProperty(name));
		}
		
		//把数据同步到文件中
		FileWriter fw=new FileWriter("aaa.properties");
		pp.store(fw,"add name attribute,update bookAuthor is zhaoliu");
		
		
	}
	
	public static void addPropertiesData() {
		//创建一个属性列表对象
		Properties pp=new Properties();
		pp.setProperty("name", "zhangsan");
		pp.setProperty("age", "20");
		pp.setProperty("address", "beijing");
		Set<String> names=pp.stringPropertyNames();
		for(String name : names) {
			System.out.println(name+"="+pp.getProperty(name));
		}
		
	}
	
	public static void putPropertiesData() {
		
		//创建一个属性列表对象
		Properties pp=new Properties();
		pp.put("className","cn.offcn.Person");
		pp.put("name","zhangsan");
		pp.put("age",22);
		
		Set<Map.Entry<Object,Object>> sets=pp.entrySet();
		
		for(Map.Entry<Object,Object> me : sets) {
			System.out.println(me.getKey()+"="+me.getValue());
		}
		
		
		
	}
}
