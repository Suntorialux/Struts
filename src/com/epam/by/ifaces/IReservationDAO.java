/**
 * 
 */
package com.epam.by.ifaces;

import com.epam.by.beans.Reservation;

/**
 * @author Andrei Yahorau
 *
 */
public interface IReservationDAO {

	Reservation getReservation(String fileName);

}
