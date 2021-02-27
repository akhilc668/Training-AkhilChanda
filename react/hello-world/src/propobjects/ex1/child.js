import React from 'react'

const Child=(props)=> {


    console.log(props)
  
    return (<>

           <div className="container py-5">
           
                 <h3>CHILD COMPONENT</h3>

                 <ol>{props.userdata}</ol>

           </div>

            </>)
}

export default Child
