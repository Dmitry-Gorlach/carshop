import axios from 'axios'

const WAREHOUSE_API_BASE_URL = "http://localhost:8080/api/warehouse/list";

class WarehouseService {

    getWarehouses() {
        return axios.get(WAREHOUSE_API_BASE_URL);
    }
}

export default new WarehouseService()