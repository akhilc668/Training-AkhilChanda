import React from 'react'
import Child from './Child.js'

const Propsobject1=()=> {
       

    return (<>

           <div className="container py-5">
           
                 <h3>PARENT COMPONENT</h3>

                  <Child id="1" name="kumar" email="kumar@gmail.com" />

           </div>

            </>)
}

export default Propsobject1 
