package co.edu.usbcali.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operacionesBasicas")
public class OperacionesMatematicas {
	
	
	@RequestMapping(value="/sumar/{numero_uno}/{numero_dos}",method=RequestMethod.GET)
	public ResultadoOperaciones sumar(@PathVariable("numero_uno")Integer n1,@PathVariable("numero_dos")Integer n2){
		ResultadoOperaciones resultadoOperaciones=new ResultadoOperaciones();
		resultadoOperaciones.setValor(n1+n2);
		return resultadoOperaciones;
	}
	@RequestMapping(value="/resta/{numero_uno}/{numero_dos}",method=RequestMethod.GET)
	public ResultadoOperaciones restar(@PathVariable("numero_uno")Integer n1,@PathVariable("numero_dos")Integer n2){
		ResultadoOperaciones resultadoOperaciones = new ResultadoOperaciones();
		resultadoOperaciones.setValor(n1-n2);
		return resultadoOperaciones;
	}
	@RequestMapping(value="/multi/{numero_uno}/{numero_dos}",method=RequestMethod.GET)
	public ResultadoOperaciones multiplicar(@PathVariable("numero_uno")Integer n1,@PathVariable("numero_dos")Integer n2){
		ResultadoOperaciones resultadoOperaciones = new ResultadoOperaciones();
		resultadoOperaciones.setValor(n1*n2);
		return resultadoOperaciones;
	}
	@RequestMapping(value="/dividir/{numero_uno}/{numero_dos}",method=RequestMethod.GET)
	public ResultadoOperaciones dividir(@PathVariable("numero_uno")Integer n1,@PathVariable("numero_dos")Integer n2){
		ResultadoOperaciones resultadoOperaciones = new ResultadoOperaciones();
		
		if(n2>0){
			resultadoOperaciones.setValor(n1/n2);
		}
		return resultadoOperaciones;
	}

}
