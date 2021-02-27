import React from 'react'
import Child from './Child.js'


class StateProp extends React.Component {
       constructor() {
              super()
              this.state = {
                     id: 101,
                     name: "Akhil",
                     email: "akhilc668@gmail.com",
                     phone: 9632014587
              }
       }

       HandleNameInput = (e) => {
              this.setState({ name: e.target.value })
       }

       render() {

              return (<>

                     <div className="container py-5">

                            <div class="form-group">
                                   <label>Name</label>
                                   <input
                                          type="text"
                                          class="form-control"
                                          value={this.state.name}
                                          onChange={this.HandleNameInput.bind(this)} />
                            </div>

                            <h3>PARENT COMPONENT</h3>

                            <Child id={this.state.id} name={this.state.name} email={this.state.email} phone={this.state.phone} />

                     </div>

              </>)
       }
}

export default StateProp 
