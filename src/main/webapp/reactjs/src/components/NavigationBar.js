import React from 'react';

import {Navbar, Nav} from 'react-bootstrap';
import {Link} from 'react-router-dom';

class NavigationBar extends React.Component{
	render() {
		return (
			<Navbar bg="dark" variant="dark">
				<Link to={""} className="navbar-brand">
					<img src="https://img2.pngio.com/books-e-book-education-learning-online-round-icon-online-book-png-512_512.png" width="35" height="35"/> Book-Hub
				</Link>
				<Nav className="mr-auto">
      				<Link to={"add"} className="nav-link">Add Book</Link>
      				<Link to={"list"} className="nav-link">Book List</Link>
    			</Nav>
			</Navbar>
		);
	}
}

export default NavigationBar;