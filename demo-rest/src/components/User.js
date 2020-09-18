import React from 'react'

export const User = ({data}) => {
	return (
		<div className="user">
			<span>id: {data.id} </span>
			<span>login: {data.username} </span>
			<span>name: {data.fullName} </span>
		</div>
	)
}
