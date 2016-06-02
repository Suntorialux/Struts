/**
 * 
 */
package com.epam.by.dao;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.epam.by.beans.Reservation;
import com.epam.by.ifaces.IReservationDAO;

/**
 * @author Andrei Yahorau
 *
 */
public class XmlDAO implements IReservationDAO {

	@Override
	public Reservation getReservation(String fileName) {
		Reservation reservation = new Reservation();
		try {
			File file = new File(fileName);
			JAXBContext jaxbContext = JAXBContext.newInstance(Reservation.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			reservation = (Reservation) jaxbUnmarshaller.unmarshal(file);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

		return reservation;
	}
}
