import React, {Component} from 'react';
import WarehouseService from "../services/WarehouseService";

class ListWarehouseComponent extends Component {
    constructor(props) {
        super(props);
        this.state = {
            warehouses: [
                {
                    id: "",
                    location: "",
                    vehicles:[]
                }
            ]
        }
    }

    componentDidMount(){
        WarehouseService.getWarehouses().then((response) =>{
            this.setState({warehouses: response.data});
        });
    }
    render() {
        return (
            <div>
                <h2 className="text-center">Warehouses</h2>
                <div className="row">
                    <table className="table table-striped table-bordered">
                        <thead>
                        <tr>
                            <th>Id</th>
                            <th>Name</th>
                            <th>Location</th>
                        </tr>
                        </thead>
                        <tbody>
                        {
                            this.state.warehouses.map(
                                warehouse =>
                                    <tr key={warehouse.id}>
                                        <td> {warehouse.id}</td>
                                        <td> {warehouse.name}</td>
                                        <td> {warehouse.location.id}</td>
                                    </tr>
                            )
                        }
                        </tbody>
                    </table>
                </div>
            </div>
        );
    }
}

export default ListWarehouseComponent;