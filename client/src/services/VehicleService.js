import axios from 'axios'

const VEHICLE_API_BASE_URL = "http://localhost:8080/api/vehicle";

class VehicleService {

    getVehicles() {
        return axios.get(VEHICLE_API_BASE_URL + '/list');
    }

    getVehicle(vehicleId) {
        return axios.get(VEHICLE_API_BASE_URL + '/' + vehicleId);
    }
}

export default new VehicleService()