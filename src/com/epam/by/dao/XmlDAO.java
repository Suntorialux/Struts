/**
 * 
 */
package com.epam.by.dao;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.epam.by.beans.Reservation;
import com.epam.by.ifaces.IXmlDAO;

/**
 * @author Andrei Yahorau
 *
 */
public class XmlDAO implements IXmlDAO {

	@Override
	public Reservation getReservation(String fileName) {
		Reservation result = new Reservation();
		try {
			File file = new File(fileName);
			JAXBContext jaxbContext = JAXBContext.newInstance(Reservation.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			result = (Reservation) jaxbUnmarshaller.unmarshal(file);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

		return result;

	}
}
