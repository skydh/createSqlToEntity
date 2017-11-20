package sqltoentity.baseentity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * 
 * @author dh
 *
 */
public class SqlToEntity {

	public static String fileName = "/text.txt";// 当前sql位置
	public static String path = "/src/sqltoentity/baseentity/";// 当前代码位置

	@SuppressWarnings("resource")
	public static void main(String arg[]) {

		StringBuilder sb = new StringBuilder();
		String s;
		try {

			File file = new File(System.getProperty("user.dir") + path + fileName);

			BufferedReader br = new BufferedReader(new FileReader(file));
			while ((s = br.readLine()) != null) {
				sb.append(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		StringBuilder className = new StringBuilder();
		String finalString = sb.toString();
		String[] stringArray1 = finalString.split("\\(");

		String[] entityName0 = stringArray1[0].split(" ");
		String[] entityName1 = entityName0[2].split("_");
		for (int i = 0; i < entityName1.length; i++) {

			className.append(upString(entityName1[i]));
		}
		className.append("Entity");

		File file = new File(System.getProperty("user.dir") + path + className.toString() + ".java");

		if (file.exists()) {
			file.delete();
		}
		try {
			file.createNewFile();
		} catch (Exception e) {

			e.printStackTrace();
		}
		StringBuilder fieldList = new StringBuilder();
		fieldList.append("@Entity" + "\r\n");
		fieldList.append("@Table(name = \"" + entityName0[2] + "\")" + "\r\n");
		fieldList.append("public class " + className.toString() + "{" + "\r\n\r\n");

		StringBuilder tempString = null;
		String[] fieldName = sb.toString().split(", ");
		for (int i = 0; i < fieldName.length; i++) {
			System.out.println(fieldName[i]);
			tempString = new StringBuilder();

			String[] temp = fieldName[i].split("[ ]+");

			if (i == 0) {
				tempString.append(getNotes(temp));
				tempString.append("    @Column(name =\"");
				tempString.append(temp[3] + "\")" + "\r\n");
				tempString.append("    private ");
				tempString.append(getType(temp[4]));
				tempString.append(" " + changeString(temp[3]) + ";");
			} else if (getType(temp[2]) != null) {
				tempString.append(getNotes(temp));
				tempString.append("    @Column(name =\"");

				tempString.append(temp[1] + "\")" + "\r\n");

				tempString.append("    private ");

				tempString.append(getType(temp[2] + " "));

				tempString.append(" " + changeString(temp[1]) + ";");
			}
			fieldList.append(tempString.toString() + "\r\n\r\n");

			// System.out.println(tempString.toString());
		}
		fieldList.append("}");
		writeFile(fieldList.toString(), System.getProperty("user.dir") + path + className.toString() + ".java");
	}

	/**
	 * 获取注释
	 * 
	 * @param temp
	 * @return
	 */
	public static String getNotes(String[] temp) {
		StringBuilder tempString = new StringBuilder();
		for (int j = 0; j < temp.length; j++) {
			if (temp[j].equals("comment")) {
				tempString.append("    /**" + "\r\n");
				tempString.append("    *" + temp[j + 1].replaceAll("'", "").replaceAll("\\);", "") + "\r\n");
				tempString.append("    */" + "\r\n");
				break;
			}
		}
		return tempString.toString();
	}

	/**
	 * 属性装换
	 * 
	 * @param temp
	 * @return
	 */
	public static String changeString(String temp) {
		String[] tempArray = temp.split("_");
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < tempArray.length; i++) {

			if (i == 0) {
				sb.append(tempArray[i]);
			} else {
				sb.append(upString(tempArray[i]));
			}

		}
		return sb.toString();
	}

	public static void writeFile(String temp, String path) {
		try {
			FileWriter fileWriter = new FileWriter(path);
			BufferedWriter buff = new BufferedWriter(fileWriter);
			buff.write(temp);
			buff.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * 首字母大写
	 * 
	 * @param temp
	 * @return
	 */
	public static String upString(String temp) {
		char[] cs = temp.toCharArray();
		cs[0] -= 32;

		return String.valueOf(cs);
	}

	/**
	 * 如有继续添加额外的
	 * 
	 * @param temp
	 * @return
	 */
	public static String getType(String temp) {
		if (temp.startsWith("varchar"))
			return "String";
		else if (temp.startsWith("char"))
			return "String";
		else if (temp.startsWith("tinyint"))
			return "Boolean";
		else if (temp.startsWith("int"))
			return "Integer";
		else if (temp.startsWith("date"))
			return "Date";
		else if (temp.startsWith("datetime"))
			return "Date";
		else if (temp.startsWith("decimal"))
			return "BigDecimal";
		else
			return null;

	}

}
