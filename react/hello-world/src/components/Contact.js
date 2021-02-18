//Contact Component...Externally
import React from 'react';

//Contact Component
const Contact=()=> {
    const myaddress=()=>
    {
        return("this is javascript Function Statement Result...")
    }
    
    return(<div style={{ backgroundColor:'lightblue',textAlign:'center' }}>
                <h1 style={{ color:'red',textAlign:'center' }}>CONTACT COMPONENT</h1>
                <h5>function  binding</h5>
                <p style={{ backgroundColor:'lightseagreen',textAlign:'center' }}>{ myaddress()   }</p>


               


        </div>);
}

export default Contact
