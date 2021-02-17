//Services Component...Externally

import React from 'react';


//Services Component
const Services=()=> {    
    var myservices=["Web Application","Mobile Application","Content Writing"]
    return(<div style={{ backgroundColor:'lightblue',textAlign:'center' }}>
                <h1 style={{ color:'red',textAlign:'center' }}>SERVICES COMPONENT</h1>
                <h5>Array binding</h5>
                <ul style={{ backgroundColor:'lightseagreen',textAlign:'center' }}>
                    <li>{ myservices[0] }</li>
                    <li>{ myservices[1] }</li>
                    <li>{ myservices[2] }</li>
                </ul>
        </div>);
}

export default Services
