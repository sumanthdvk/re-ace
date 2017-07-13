package com.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.input.ConfigitAceImport;
import com.mapper.ConfigitAceImportMapper;
import com.output.ConfigitAceImportType;

public class SampleImportMain {

	public static void main(String[] args) {
		File file = new File("C:/RE Data/Input_Import/1669v5_5.XML");
		try {
			JAXBContext jaxbInputContext = JAXBContext.newInstance(ConfigitAceImport.class);
			Unmarshaller jaxbUnmarshaller = jaxbInputContext.createUnmarshaller();
			ConfigitAceImport inputImport = (ConfigitAceImport) jaxbUnmarshaller.unmarshal(file);
			System.out.println("Unmarshalling.... Done!");
			
			JAXBContext jaxbOutputContext = JAXBContext.newInstance(ConfigitAceImportType.class);
			Marshaller jaxbMarshaller = jaxbOutputContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			ConfigitAceImportType obj = new ConfigitAceImportType();
			ConfigitAceImportMapper.mapToConfigitAceImportType(inputImport,obj);
			jaxbMarshaller.marshal(obj, new FileOutputStream("C:/RE Data/Input_Import/1669_Output.xml"));
			System.out.println("Marshalling.... Done!");
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			System.out.println("File with output file name not found.");
			e.printStackTrace();
		}

	}

}
