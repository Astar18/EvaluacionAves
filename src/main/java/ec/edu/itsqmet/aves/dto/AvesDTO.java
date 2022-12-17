package ec.edu.itsqmet.aves.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class AvesDTO {
	@Autowired
	private IAvesService avesService;
	
	@GetMapping("/getAll")
	
	public ResponseEntity<List<AvesDTO>> getAll(){
		List<AvesDTO> p=avesService.getAll();
		return new ResponseEntity(null)<List<AvesDTO>>(p, HttpStatus.OK);
		
		
	}
}
