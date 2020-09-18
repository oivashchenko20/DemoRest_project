import React, { useEffect } from "react";
import { useDispatch, useSelector } from "react-redux";
import { fetchUsers } from "../store/actions/users";
import { User } from "./User";

export const Users = () => {
	const dispatch = useDispatch();
	const users = useSelector(({users}) => users.list);

	useEffect(() => {
		dispatch(fetchUsers());
	}, []);

	return (
		<div className="users">
		{users.map(user => (
			<User key={user.id} data={user}></User>
		))}
		</div>
	);
};
