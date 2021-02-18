import React from 'react';
import { BrowserRouter, Route, Link }  from 'react-router-dom';


//import Information/view Components...
import Home from './Home.js'
import About from './About.js'
import Services from './Services.js'
import Contact from './Contact.js'


const Routings=()=> 
{
    return (<>

<BrowserRouter>

                <Link to="/home">Home</Link> &nbsp;&nbsp;
                <Link to="/about">About</Link> &nbsp;&nbsp;
                <Link to="/services">Services</Link> &nbsp;&nbsp;
                <Link to="/contact">Contact</Link> &nbsp;&nbsp;

                <br /><br />
                
                <Route exact path="/" component={Home} />
                <Route path="/home" component={Home} />
                <Route path="/about" component={About} />
                <Route path="/services" component={Services} />
                <Route path="/contact" component={Contact} />
                
</BrowserRouter>

    </>)
}


export default Routings