import React from 'react';
import { BrowserRouter,Route, Switch,Link,Redirect} from 'react-router-dom';

const Courses=()=> {

    return (<>
    <BrowserRouter>
        <div className="container py-5">
            
            <div className="row">
                
                {/*  Left column Block */}
                <div className="col-lg-3">

                    <nav>
                        <ul className="list-group">
                            <li className="list-group-item">
                                <Link to="/courses/mernstack">MERNSTACK</Link>
                            </li>

                            <li className="list-group-item">
                                <Link to="/courses/meanstack">MEANSTACK</Link>
                            </li>

                            <li className="list-group-item">
                                <Link to="/courses/angular"> ANGULAR</Link>
                            </li>

                            <li className="list-group-item">
                                 <Link to="/courses/react">REACT</Link>
                            </li>

                            <li className="list-group-item">
                                <Link to="/courses/python">PYTHON</Link>
                            </li>

                            <li className="list-group-item">
                                <Link to="/courses/php">PHP</Link>
                            </li>

                        </ul>
                    </nav>

                </div>
                {/*  Left column Block */}

                {/*  Right column Block */}
                <div className="col-lg-9">


                <Switch>
                    <Route exact path="/courses" render={ ()=> <h1>THIS IS MERNSTACK COURSE DETAILS</h1> } />
                    <Route  path="/courses/mernstack" render={ ()=> <h1>THIS IS MERNSTACK COURSE DETAILS</h1> } />
                    <Route  path="/courses/meanstack" render={ ()=> <h1>THIS IS <u>MEANSTACK</u> COURSE DETAILS</h1> } />
                    <Route  path="/courses/angular" render={ ()=> <h1>THIS IS ANGULAR COURSE DETAILS</h1> } />
                    <Route  path="/courses/react" render={ ()=> <h1>THIS IS REACT COURSE DETAILS</h1> } />
                    <Route  path="/courses/python" render={ ()=> <h1>THIS IS PYTHON COURSE DETAILS</h1> } />
                    <Route  path="/courses/php" render={ ()=> <h1>THIS IS PHP COURSE DETAILS</h1> } />
                    <Redirect to="/courses" />
                </Switch>


                </div>
                 {/*  Right column Block */}
                
            </div>

        </div>
        </BrowserRouter>
    </>)
}


export default Courses