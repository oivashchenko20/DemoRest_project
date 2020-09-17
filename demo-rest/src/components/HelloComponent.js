import React, { Component, useCallback, useEffect, useMemo, useState } from "react"

// export default class HelloComponent extends Component {
// 	constructor(props) {
// 		super(props);
// 		this.state = { message: ""};
// 	}

// 	componentDidMount() {
// 		 fetch('http://localhost:8080')
// 			.then(response => response.text())
// 			.then(result => this.setState({ message: result }));
// 	}

// 	render() {
// 		const message = this.state;
// 		return <div> Hello {message.message}</div>;
// 	}
// }

const HelloComponent = () => {
	const [text, setText] = useState('')

	const fetchText = useCallback(async () => {
		const response = await fetch('http://localhost:8080');
		const text = await response.text();
		
		setText(text);
	})

	useEffect(() => {
		fetchText();
	})

	return <div>
		Text: {text}
	</div>
}

export default HelloComponent