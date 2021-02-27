import React from 'react';
import { BrowserRouter, Route }  from 'react-router-dom';


//import Information/view Components...
import Header from './Header.js'
import Footer from './Footer.js'

import Home from './Home.js'
import About from './About.js'
import Services from './Services.js'
import Contact from './Contact.js'
import Courses from './Courses.js'
import Signup from './Signup'
import Propsobject from './Propsobject.js';


const RoutingsHeader=()=> 
{
    return (<>

<BrowserRouter>

               {/* navbar Component */ }
               
                <Header />   <br/><br/>
               
               {/* navbar Component */ }
                
                <Route exact path="/" component={Home} />
                <Route path="/home" component={Home} />
                <Route path="/about" component={About} />
                <Route path="/services" component={Services} />
                <Route path="/contact" component={Contact} />
                <Route path="/courses" component={Courses} />
		        <Route path="/signup" component={Signup} />
                <Route path="/propobj" component={Propsobject}/>



                  {/* Footer Component */ }
                  <br/><br/><br/><br/>
                  <Footer /> 
               
                  {/* Footer Component */ }

                
</BrowserRouter>

    </>)
}


export default RoutingsHeader