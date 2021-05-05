import './App.css';
import ListVehicleComponent from "./components/ListVehicleComponent";
import React from "react";
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom'
import HeaderComponent from "./components/HeaderComponent";
import FooterComponent from "./components/FooterComponent.";
import ListWarehouseComponent from "./components/ListWarehouseComponent";
import VehicleComponent from "./components/VehicleComponent";

function App() {
    return (
        <div>
            <Router>
                    <HeaderComponent/>
                    <div className="container">
                        <Switch> http://localhost:3000/vehicle/
                            <Route path="/api/vehicle/list" component={ListVehicleComponent}></Route>
                            <Route path="/api/vehicle/:id" component={VehicleComponent}></Route>
                        </Switch>
                        <Switch> http://localhost:3000/warehouse/list
                            <Route path="/api/warehouse" component={ListWarehouseComponent}></Route>
                            <Route path="/api/warehouse/list" component={ListWarehouseComponent}></Route>
                        </Switch>
                    </div>
                    <FooterComponent/>
            </Router>
        </div>
    );
}

export default App;
