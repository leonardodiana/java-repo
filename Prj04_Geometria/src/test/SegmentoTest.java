package test;

import forme.Punto;
import forme.Segmento;

public class SegmentoTest {
	
	Punto a = new Punto(3,2);
	Punto b = new Punto(7,2);
	Punto c = new Punto(3,5);
	
	Segmento ab = new Segmento(a,b);
	Segmento bc = new Segmento(c,c);
	Segmento ac = new Segmento(a,c);
	
}
