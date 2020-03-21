package jianshu2;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class XmlReaderTest {
	@Test
	public void XmlReader() throws IOException, ParserConfigurationException, SAXException {

		InputStream inputStream = new ClassPathResource("jianshu2-config.xml").getInputStream();

		/**
		 * 获取DocumentBuilderFactory
		 * 通过DocumentBuilderFactory获取DocumentBuilder
		 * 解析inputStream
		 */
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = factory.newDocumentBuilder();
		Document doc = docBuilder.parse(inputStream);

		// 获取element并循环输出
		Element documentElement = doc.getDocumentElement();
		NodeList nodes = documentElement.getChildNodes();
		for (int i = 0; i < nodes.getLength(); i++) {
			Node node = nodes.item(i);
			NamedNodeMap attributes = node.getAttributes();
			if (null != attributes) {
				System.out.println(attributes.getNamedItem("id"));
				System.out.println(attributes.getNamedItem("class"));
			}
		}
	}
}


