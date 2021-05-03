import React, {Component} from 'react';
import VehicleService from "../services/VehicleService";

class ListVehicleComponent extends Component {
    constructor(props) {
        super(props);
        this.state = {
            vehicles: []
        }
    }

    componentDidMount(){
        VehicleService.getVehicles().then((response) =>{
                this.setState({vehicles: response.data});
            });
    }
    render() {
        return (
            <div>
                <h2 className="text-center">Second hand vehicles</h2>
                <div className="row">
                    <table className="table table-striped table-bordered">
                        <thead>
                        <tr>
                        <th>Id</th>
                        <th>Make</th>
                        <th>Model</th>
                        <th>Year model</th>
                        <th>Price</th>
                        <th>Licensed</th>
                        <th>Date added</th>
                        </tr>
                        </thead>
                        <tbody>
                        {
                            this.state.vehicles.map(
                                vehicle =>
                                    <tr key={vehicle.id}>
                                        <td> {vehicle.id}</td>
                                        <td> {vehicle.make}</td>
                                        <td> {vehicle.model}</td>
                                        <td> {vehicle.yearModel}</td>
                                        <td> {vehicle.price}</td>
                                        <td> {vehicle.licensed.toString()}</td>
                                        <td> {vehicle.dateAdded}</td>
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

export default ListVehicleComponent;