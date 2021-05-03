import React, {Component} from 'react';

class ListVehicleComponent extends Component {
    constructor(props) {
        super(props);
        this.state = {
            vehicles: []
        }
    }

    render() {
        return (
            <div>
                <h2 className="text-center">Second hand vehicles</h2>
                <div className="row">
                    <table className="table table-striped table-bordered">
                        <thead>
                        <th>Id</th>
                        <th>Make</th>
                        <th>Model</th>
                        <th>Year model</th>
                        <th>Price</th>
                        <th>licensed</th>
                        <th>Date added</th>
                        </thead>
                        <tbody>
                        {
                            this.state.vehicles.map(
                                vehicle =>
                                    <tr key={vehicle.id}>
                                        <td> {vehicle.id}</td>
                                        <td> {vehicle.make}</td>
                                        <td> {vehicle.model}</td>
                                        <td> {vehicle.year_model}</td>
                                        <td> {vehicle.price}</td>
                                        <td> {vehicle.licensed}</td>
                                        <td> {vehicle.date_added}</td>
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