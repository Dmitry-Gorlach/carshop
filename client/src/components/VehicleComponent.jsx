import React, {Component} from 'react';
import VehicleService from "../services/VehicleService";

class VehicleComponent extends Component {
    constructor(props) {
        super(props);
        this.state = {
            vehicle: {
                id: "",
                make: "",
                model: "",
                year_model: "",
                price: "",
                licensed: "",
                date_added: ""
            }
        }
    }

    componentDidMount() {
        VehicleService.getVehicle(this.props.match.params.id).then((response) => {
            let vehicle = response.data;
            this.setState({vehicle: response.data});
            this.setState({
                id: vehicle.id,
                make: vehicle.make,
                model: vehicle.model,
                year_model: vehicle.year_model,
                price: vehicle.price,
                licensed: vehicle.licensed,
                date_added: vehicle.date_added
            });
        });
    }

    render() {
        return (
            <div>
                <h2 className="text-center">Vehicle details</h2>
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
                        <td> {this.state.vehicle.id}</td>
                        <td> {this.state.vehicle.make}</td>
                        <td> {this.state.vehicle.model}</td>
                        <td> {this.state.year_model}</td>
                        <td> {this.state.price}</td>
                        <td> {this.state.licensed}</td>
                        <td> {this.state.date_added}</td>
                        </tbody>
                    </table>
                </div>
            </div>
        );
    }
}

export default VehicleComponent;