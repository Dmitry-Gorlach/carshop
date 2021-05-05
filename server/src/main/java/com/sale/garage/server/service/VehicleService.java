package com.sale.garage.server.service;

import com.sale.garage.server.mapstruct.dtos.VehicleDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VehicleService {

    List<VehicleDto> findAllSortingByDateAdded();

    VehicleDto findById(final Long id);
}
