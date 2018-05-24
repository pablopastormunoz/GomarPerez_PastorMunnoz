package evolsoft.concesionario.service;

import java.util.List;

import evolsoft.concesionario.dto.CocheDTO;
import evolsoft.concesionario.exception.NotFoundExcept;
import evolsoft.concesionario.model.Coche;

public interface CocheService {

	CocheDTO findById(Integer id) throws NotFoundExcept;

	List<CocheDTO> findAll(Integer page, Integer size);

	CocheDTO create(CocheDTO cocheDTO);

void createList(List<CocheDTO> listCocheDto);

	void update(Integer id, CocheDTO cocheDTO);

	void delete(Integer idCoche);

	public Coche map(CocheDTO coche);

	public CocheDTO map(Coche coche);

	public List<CocheDTO> findCochesInStock();

	public List<CocheDTO> listCochesSortedByPrice(Integer page, Integer size);

	public List<CocheDTO> findCarsAlreadySold();
	
	public List<CocheDTO> findCochesInPriceRange(Integer minPrice, Integer maxPrice);

    void newSell(Integer idCoche, Integer idCliente, Integer idVendedor) throws NotFoundExcept;

    void createList(List<CocheDTO> listCocheDto);
}
