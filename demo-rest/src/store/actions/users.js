import { SET_USERS } from "../../constants/actions";

const setUser = users => ({
    type: SET_USERS,
    payload: users
}) 

export const fetchUsers = () => async dispatch => {
    const response = await fetch("http://localhost:8080");
    const users = await response.json();

    dispatch(setUser(users));
}