/*
 * CostAndVolume.java
 * 
 * Copyright 2016 graf <graf@chillosphere.spacepotato>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class CostAndVolume {
	
	private void CaV(){
		int loopTimes = 0;
		double volume = 0;
		double radius = 0;
		double pi = 3.14;		
		
		
		Scanner keys = new Scanner(System.in);
		System.out.println("Input number of schematics.");
		loopTimes = keys.nextInt();
		
		for (int x = 1; x <= loopTimes; x++){
			DecimalFormat moneyfication = new DecimalFormat("0.00");
			DecimalFormat twoDigits = new DecimalFormat("0.00");
			double height, getCost;
			
			System.out.println("Input volume.");
			volume = keys.nextDouble();
			System.out.println("Input radius.");
			radius = keys.nextDouble();
			height = volume / (pi * (radius * radius));
			getCost = 2.0 * pi * radius * (radius + height);
			System.out.println("**Specifications**");
			System.out.println();
			System.out.println("Volume: " + twoDigits.format(volume) + "cm");
			System.out.println("Radius: " + twoDigits.format(radius) + "cm");
			System.out.println("Height: " + twoDigits.format(height) + "cm");
			System.out.println("Cost: " + "$" + moneyfication.format(getCost));
			
			}
		
		}
	
	public static void main (String args[]) {
		CostAndVolume demo = new CostAndVolume();
		demo.CaV();
		
	}
}

