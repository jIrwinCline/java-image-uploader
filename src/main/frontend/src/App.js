import React, { useState, useEffect, useCallback } from "react";
import axios from "axios";
import { useDropzone } from "react-dropzone";

const UserProfiles = () => {
  const [userProfiles, setUserProfiles] = useState([]);
  const fetchUserProfiles = () => {
    axios.get("http://localhost:8080/api/v1/user-profile").then((res) => {
      console.log(res);
      const data = res.data;
      setUserProfiles(data);
    });
  };
  useEffect(() => {
    fetchUserProfiles();
  }, []);
  return userProfiles.map((userProfile, index) => {
    return (
      <div key={index}>
        <Dropzone />
        <h1>{userProfile.username}</h1>
        <p>{userProfile.userProfileId}</p>
      </div>
    );
  });
};

function Dropzone() {
  const onDrop = useCallback((acceptedFiles) => {
    const file = acceptedFiles[0];
  }, []);
  const { getRootProps, getInputProps, isDragActive } = useDropzone({ onDrop });

  return (
    <div {...getRootProps()}>
      <input {...getInputProps()} />
      {isDragActive ? (
        <p>Drop the files here ...</p>
      ) : (
        <p>Drag 'n' drop some files here, or click to select files</p>
      )}
    </div>
  );
}

function App() {
  return (
    <div className="App">
      <UserProfiles />
    </div>
  );
}

export default App;
