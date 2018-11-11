package br.com.primefaces;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import br.com.model.Car;
import br.com.model.CarService;

@ManagedBean(name = "dtBasicView")
@ViewScoped
public class DataBasicView implements Serializable {

	private List<Car> cars;

	@ManagedProperty("#{carService}")
	private CarService service;

	@PostConstruct
	public void init() {
		cars = service.createCars(10);
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setService(CarService service) {
		this.service = service;
	}
}
