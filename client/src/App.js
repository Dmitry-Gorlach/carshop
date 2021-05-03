import './App.css';
import ListVehicleComponent from "./components/ListVehicleComponent";
import React from "react";
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom'
import HeaderComponent from "./components/HeaderComponent";
import FooterComponent from "./components/FooterComponent.";

function App() {
    return (
        <div>
            <Router>
                    <HeaderComponent/>
                    <div className="container">
                        <Switch> http://localhost:3000/vehicle/list
                            <Route path="/" component={ListVehicleComponent}></Route>
                            <Route path="/vehicle/list" component={ListVehicleComponent}></Route>
                            <ListVehicleComponent/>
                        </Switch>
                    </div>
                    <FooterComponent/>
            </Router>
        </div>
    );
}

export default App;
