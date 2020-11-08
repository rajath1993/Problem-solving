import java.util.HashMap;
import java.util.Map;

public class FlattenDict {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Object> dict = new HashMap<>();
		String s1 = "\"";
		dict.put("key1","1");
//		HashMap<String,Object> c = new HashMap<>();
//		c.put(s1+"d"+s1,s1+"3"+s1);
//		c.put(s1+"e"+s1,"1");
//		HashMap<String,Object> key2 = new HashMap<>();
//		key2.put(s1+"a"+s1,"2");
//		key2.put(s1+"b"+s1, "3");
//		dict.put(s1+"c"+s1,c);
//		
		HashMap<String,Object> key2 = new HashMap<>();
		key2.put("a","2");
		key2.put("b","3");
		
		HashMap<String,Object> c = new HashMap<>();
		c.put("d","3");
		HashMap<String,Object> e = new HashMap<>();
		e.put("","1");
		c.put("e",e);
		
		key2.put("c",c);
		
		dict.put("key2",key2);
		
		
		System.out.println(dict);
		
		System.out.println(flattenDictionary(dict));
		
		HashMap<Integer,Integer> hmap = new HashMap<>();
		
	}
	
	public static HashMap<String,String> flattenDictionary(HashMap<String,Object> dict){
		HashMap<String,String> flatDict = new HashMap<>();
		
		flattenDictHelper("",dict,flatDict);
		
		
		return flatDict;
	}
	
	public static void flattenDictHelper(String initialKey,HashMap<String,Object> dict,HashMap<String,String> flatDict) {
		dict.forEach((k,v) -> {
			if(v instanceof String) {
				if(initialKey==null||initialKey=="")
					flatDict.put(k,v.toString());
				else
					flatDict.put(initialKey+"."+k,v.toString());
			}
			else {
				if(initialKey==null||initialKey=="") {
					flattenDictHelper(k,(HashMap<String, Object>) v,flatDict);
				}
				else {
					System.out.println(initialKey);
					flattenDictHelper(initialKey+"."+k,(HashMap<String, Object>) v,flatDict);
				}
					
			}
			
		});
	}

}
