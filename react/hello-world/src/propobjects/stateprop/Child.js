import React from 'react'

class Child extends React.Component {
      constructor(props){
            super(props);
      }
      render() {
            

            return (<>

                  <div className="container py-5">

                        <h3>CHILD COMPONENT</h3>
                        {this.props.id} - {this.props.name} - {this.props.email}-{this.props.phone}

                  </div>

            </>)
      }

}

export default Child
