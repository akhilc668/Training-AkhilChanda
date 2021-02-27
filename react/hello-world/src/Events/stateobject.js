import React,{  setState } from 'react'

//child CLASSES
class StateObject extends  React.Component 
{

  constructor() 
  {
    super();

    //Step-1: Create state object and Initialization also
    this.state={
                  id:1,
                  name:'kumar',
                  email:'kumar@gmail.com'
               }
  }




  render() 
  {
      return(<>  

               <div class="container py-5">
                    <h3 className="text-center py-3">CLASS_COMPONENT_with_STATE_OBJECT</h3>

                    <p> {/* step-2 */}
                      U_ID is: { this.state.id }    &nbsp; &nbsp;&nbsp;


                    {/* step-3 */ } 
                      <button className="btn btn-info"  
                           onClick={ ()=> this.setState({   id:101 })  }>
                              Change ID_Property
                      </button>
                      
                      </p>
                    


                    <p>U_NAME is: { this.state.name }  &nbsp; &nbsp;&nbsp;

                  <button className="btn btn-info" 
                          onClick={ ()=> this.setState({   name:"vijaykumar" })  }>
                                  Change NAME_Property
                  </button>
                    </p>
                    

                    <p>U_EMAIL is: { this.state.email } 
                    &nbsp; &nbsp;&nbsp;

                          <button className="btn btn-info" 
                                  onClick={ ()=> this.setState({   email:"vijaykumar@gmail.com" })  }>
                                          Change EMAIL_Property
                          </button>
                  </p>

                
               </div>
            </>)
  }

}

export default StateObject