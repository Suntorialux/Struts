/**
 * 
 */
package com.epam.by.ifaces;

import com.epam.by.beans.Reservation;

/**
 * @author Andrei Yahorau
 *
 */
public interface IXmlDAO {

	Reservation getReservation(String fileName);

}
