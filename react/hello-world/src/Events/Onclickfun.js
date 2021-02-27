import React,{  setState } from 'react'

//child CLASSES
class OnClickFun extends  React.Component 
{

  constructor() 
  {
    super();

    //Step-1: Create state object and Initialization also
    this.state={ counter:0 }
  }


  //Custom_class_Functions for StateHandlings
  handleStateData=()=>
  {
    this.setState({   
                    counter: this.state.counter+1
                  })
  }

  handleStateDataDislike=()=>
  {
    this.setState({   
                    counter: this.state.counter-1
                  })
  }

  render() {
     
     

      return(<>  

               <div class="container py-5">
                    <h3 className="text-center py-3">onClick</h3>

                    <button type="button"
                          className="btn btn-info" 
                          onClick={  this.handleStateData }> 
                          Like
                    </button>

                    <p> counter : { this.state.counter } </p>

                    <button type="button"
                          className="btn btn-info" 
                          onClick={  this.handleStateDataDislike }> 
                          Dislike
                    </button>


               </div>
            </>)
  }

}

export default OnClickFun